/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import model.FechaModel;
import org.joda.time.DateTime;

/**
 *
 * @author LENOVO
 */
@Named(value = "fechaC")
@Dependent
public class FechaC {

    private FechaModel fech;

    public FechaC() {
        fech = new FechaModel();
    }

    public void cosumidorFecha() {
        fech.metodos();
    }

    public FechaModel getFech() {
        return fech;
    }

    public void setFech(FechaModel fech) {
        this.fech = fech;
    }

}
