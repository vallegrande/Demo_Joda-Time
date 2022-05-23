package dao;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DateTime now = new DateTime();
        System.out.println("Current Dia: " + now.dayOfWeek().getAsText());
        System.out.println("Current Mes: " + now.monthOfYear().getAsText());
        System.out.println("Current Año: " + now.year().getAsText());
        System.out.println("El año actual es bisiesto: " + now.year().isLeap());
  
        // get current date and time
        LocalDateTime dt = LocalDateTime.now();
  
        System.out.println(dt);

         
    


    }
}
