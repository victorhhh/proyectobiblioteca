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
public class PublicacionPeriodica extends Lectura{
    private String Editor;
    private String numeroDePublicacion;
    private String periodo;

    /**
     * @return the Editor
     */
    public String getEditor() {
        return Editor;
    }

    /**
     * @param Editor the Editor to set
     */
    public void setEditor(String Editor) {
        this.Editor = Editor;
    }

    /**
     * @return the numeroDePublicacion
     */
    public String getNumeroDePublicacion() {
        return numeroDePublicacion;
    }

    /**
     * @param numeroDePublicacion the numeroDePublicacion to set
     */
    public void setNumeroDePublicacion(String numeroDePublicacion) {
        this.numeroDePublicacion = numeroDePublicacion;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
