package com.prueba.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;





public class PagoQuincena {
	
	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
		//Imprimimos la fecha de pago de la quincena
		msgImprimir("Fecha obtenida: " + date);
		try{
           
            if(date.getDayOfMonth()==15 || date.getDayOfMonth()==30){
                msgImprimir("Fecha de pago de la quincena: " + findDay(date));
                this.date=findDay(date);
            }else if(date.getDayOfMonth()<15 && date.getDayOfMonth()>=1 ){
                date=diffDates(date, 15);
                msgImprimir("Fecha de pago de la quincena: " + findDay(date));
                this.date=findDay(date);
            }
            else if(date.getDayOfMonth()<30 && date.getDayOfMonth()>15 ){
                date=diffDates(date, 30);
                msgImprimir("Fecha de pago de la quincena: " + findDay(date));
                this.date=findDay(date);
            }
        }catch(Exception e){
            msgImprimir("Fecha ingresada incorrecta");
        }
	}
	
	
	// imprimir mensaje
    public static void msgImprimir( String msg){
        System.out.println(msg);
    }

    //----------------------Metodos----------------- 

    // En este metodo se crea lista con todos los dias festivos del año 2023
    public static List<LocalDate> listHolidays(){
        List<LocalDate> holidays=new ArrayList<>();

        //Agregamos lista de posibles dias festivos

        holidays.add(LocalDate.of(2023, 1, 1)); // Año Nuevo
        holidays.add(LocalDate.of(2023, 1, 9)); // Día de los Reyes Magos
        holidays.add(LocalDate.of(2023, 3, 20)); // Día de San José
        holidays.add(LocalDate.of(2023, 4, 13)); // Jueves Santo
        holidays.add(LocalDate.of(2023, 4, 14)); // Viernes Santo
        holidays.add(LocalDate.of(2023, 5, 1)); // Día del Trabajo
        holidays.add(LocalDate.of(2023, 5, 29)); // Día de la Ascensión
        holidays.add(LocalDate.of(2023, 6, 19)); // Corpus Christi
        holidays.add(LocalDate.of(2023, 6, 26)); // Sagrado Corazón
        holidays.add(LocalDate.of(2023, 7, 3)); // San Pedro y San Pablo
        holidays.add(LocalDate.of(2023, 7, 20)); // Día de la Independencia
        holidays.add(LocalDate.of(2023, 8, 7)); // Batalla de Boyacá
        holidays.add(LocalDate.of(2023, 8, 15)); // Asunción de la Virgen
        holidays.add(LocalDate.of(2023, 10, 16)); // Día de la Raza
        holidays.add(LocalDate.of(2023, 11, 6)); // Día de los Santos
        holidays.add(LocalDate.of(2023, 12, 8)); // Día de la Inmaculada Concepción
        holidays.add(LocalDate.of(2023, 12, 25)); // Navidad

        return holidays;
    }

    // Este metodo encuentra el día de pago 
    public static LocalDate findDay(LocalDate date){
        //DayOfWeek dayWeek=date.getDayOfWeek();
        //String day=""+dayWeek;
        if(findHoliday(date)){
            if(date.getDayOfWeek()==DayOfWeek.SATURDAY){
                date=previewDay(date);
            }else if(date.getDayOfWeek()==DayOfWeek.SUNDAY){
                date=nextDay(date);
            }else{
                date=previewDay(date);
            }
        }
        return date;
    }


    // Este metodo valida si el día habil mas cercano es el siguiente
    public static LocalDate nextDay(LocalDate date){
        int count=0;
        while(findHoliday(date)){

            if(count==0){
                date=date.plusDays(1);
                
            }else{
                date=previewDay(date);
            }
            count++;
        }
        return date;
    }

   // Este metodo valida si el día habil mas cercano es el antetior
    public static LocalDate previewDay( LocalDate date){
        while(findHoliday(date)){
            date=date.minusDays(1);
        }
        return date;
        
    }

    // Este metodo valida todos los posibles dias festivos
    public static boolean findHoliday(LocalDate date){
        List<LocalDate> holidays=listHolidays();

        if(date.getDayOfWeek()==DayOfWeek.SATURDAY){
            return true;
        } else if(date.getDayOfWeek()==DayOfWeek.SUNDAY){
            return true;
        } else if(holidays.contains(date)){
            return true;
        }
        else{
            return false;
        }

    }

    // Calcular la diferencia de fecha con el dia de quincena

    public static LocalDate diffDates(LocalDate date,int nMax){
        
        int diff=nMax-date.getDayOfMonth();
        date=date.plusDays(diff);
        return date;
    }
	
}
