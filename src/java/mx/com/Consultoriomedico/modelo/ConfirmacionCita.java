/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.Consultoriomedico.modelo;

/**
 *
 * @author Jossue
 */
public class ConfirmacionCita {
    String Confirmacion;

    public void ConfirmacionCita(String confirmacion){
    this.Confirmacion = confirmacion;
    }
    
    public String getConfirmacion() {
        return Confirmacion;
    }

    public void setConfirmacion(String Confirmacion) {
        this.Confirmacion = Confirmacion;
    }

    @Override
    public String toString() {
        return "ConfirmacionCita{" + "Confirmacion=" + Confirmacion + '}';
    }
    
    
}
