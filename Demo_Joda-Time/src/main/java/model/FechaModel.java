
package model;

import org.joda.time.DateTime;
public class FechaModel {
    private String dia;
    private String mes;
    private String year;
   private Boolean bisiesto;
   private DateTime fecha;
    DateTime now = new DateTime();
    
   public void metodos(){
        setDia(now.dayOfWeek().getAsText());
        setMes(now.monthOfYear().getAsText());
        setYear(now.year().getAsText());
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(year);
   }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public DateTime getFecha() {
        return fecha;
    }

    public void setFecha(DateTime fecha) {
        this.fecha = fecha;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Boolean getBisiesto() {
        return bisiesto;
    }

    public void setBisiesto(Boolean bisiesto) {
        this.bisiesto = bisiesto;
    }
}
