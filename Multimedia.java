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
public abstract class Multimedia extends Item{
    private String duracion;
    private String peso;
    private String productora;

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the productora
     */
    public String getProductora() {
        return productora;
    }

    /**
     * @param productora the productora to set
     */
    public void setProductora(String productora) {
        this.productora = productora;
    }
    
}
