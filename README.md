# Consulta_Pago_Quincena
Prueba Konecta Programación Java

## Descripción
El software desarrollado recibe una fecha en el formato yyyy-mm-dd, de tal manera que devuelve la fecha de pago de la quincena, tal que sie esta es un día hábil más cercano al día 15 o 30 con respecto a lo ingresado por el usuario, se da prioridad al anterior en caso de empate.

Ej: Si el usuario ingresa 30 de abril que es domingo, y el próximo lunes es festivo, la fecha a devolver será el viernes 28.

Si el usuario ingresa el día 30 de julio que es domingo y el lunes no es festivo, devolverá el lunes 31.

Si el usuario ingresa el día 15 de junio que es jueves, devolverá el mismo día.

## Características

- Packaging: Jar
- Lenguaje de programacion: JAVA 20
- Framework: Spring Boot 4.18.0
- Proyecto: Maven 
- Frontend: Thymeleaf
- Dependencias: Spring Web, Thymeleaf, Spring Boot DevTools, Validation

## Instalación
1. Extraer los archivos contenidos en el "Consulta_Pago_Quincena.rar"
2. Lanzar la aplicación de forma local dando doble clic sobre el archivo "Consulta_Pago_Quincena.jar" o click derecho sobre archivo y elegir la opcion "abrir con" y seleccionar "Java(TM) Platform SE binary"
3. Abrir un buscador (Chrome, Firefox, etc.) y pegar la siguiente ruta: "http://localhost:8080/"
4. Finalmente, la aplicación se iniciará.

## Consideraciones
- Verificar antes de ejecutar el archivo ".jar" que el archivo "aplication.properties" se encuentre en el mismo directorio.

Nota: Se ha agregado el archivo "PagoQuincena.java" el cual se puede compilar por consola. Instrucciones de uso:
1. Abrir la terminal en el directorio raíz donde se encuentra el archivo "PagoQuincena.java".
2. Lanzar el programa usando el siguiente comando: `java .\PagoQuincena.java`
3. Ingresar la fecha en el formato indicado en el mensaje y presionar la tecla Enter.
4. Por último, el programa imprimirá la fecha de pago de la quincena en el mismo formato.
