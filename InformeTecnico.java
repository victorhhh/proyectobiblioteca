/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author VictorHugo
 */
public class InformeTecnico {
    private String nombreDelArea;
    private String responsableDeLaEvalucion;
    private String cargo;
    private String justificacion;

    /**
     * @return the nombreDelArea
     */
    public String getNombreDelArea() {
        return nombreDelArea;
    }

    /**
     * @param nombreDelArea the nombreDelArea to set
     */
    public void setNombreDelArea(String nombreDelArea) {
        this.nombreDelArea = nombreDelArea;
    }

    /**
     * @return the responsableDeLaEvalucion
     */
    public String getResponsableDeLaEvalucion() {
        return responsableDeLaEvalucion;
    }

    /**
     * @param responsableDeLaEvalucion the responsableDeLaEvalucion to set
     */
    public void setResponsableDeLaEvalucion(String responsableDeLaEvalucion) {
        this.responsableDeLaEvalucion = responsableDeLaEvalucion;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the justificacion
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * @param justificacion the justificacion to set
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    
}
