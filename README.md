# Consulta_Pago_Quincena
Prueba Konecta Programación Java

    Descripción:

El software desarrollado recibe una fecha en el formato yyyy-mm-dd, de tal manera que devuelve la fecha de pago de la quincena, tal que sie esta es un día hábil más cercano al día 15 o 30 con respecto a lo ingresado por el usuario, se da prioridad al anterior en caso de empate.

Ej: Si el usuario ingresa 30 de abril que es domingo, y el próximo lunes es festivo, la fecha a devolver será el viernes 28.

Si el usuario ingresa el día 30 de julio que es domingo y el lunes no es festivo, devolverá el lunes 31.

Si el usuario ingresa el día 15 de junio que es jueves, devolverá el mismo día.


2.Características:

2.1. Packaging: Jar
2.2. Lenguaje de programacion: JAVA 20
2.2. Framework: Spring Boot
2.3. Proyecto: Maven 
2.4. Frontend:thymeleaf
2.5. Dependencias: Spring Web,Thymeleaf,Spring Boot DevTools, Validation

    Instalación: 3.1 Extraer los archivos contenidos en el "Consulta_Pago_Quincena.rar" 3.2. Lanzar aplicación de forma local dando doble CLICK sobre el archivo "Consulta_Pago_Quincena.jar". 3.3. Abrir buscador (Chrome,Firefox,etc..) y pegar la ruta: "http://localhost:8080/". 3.6. Finalmente, La aplicación iniciara.

    Consideraciones: 4.1. Verificar antes de ejecutar el archivo ".jar" que el archivo "aplication.propierties" se encuentre en el mismo directorio. 
