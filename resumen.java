/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Ada
 */
public class resumen<T> {
    private String Título;
    private String Autores;
    private String info;
    private String p_clave;

    public resumen(String Título, String Autores, String info, String p_clave) {
        this.Título = null;
        this.Autores = null;
        this.info = null;
        this.p_clave = null;
    }
    
    

    /**
     * @return the Título
     */
    public String getTítulo() {
        return Título;
    }

    /**
     * @param Título the Título to set
     */
    public void setTítulo(String Título) {
        this.Título = Título;
    }

    /**
     * @return the Autores
     */
    public String getAutores() {
        return Autores;
    }

    /**
     * @param Autores the Autores to set
     */
    public void setAutores(String Autores) {
        this.Autores = Autores;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return the p_clave
     */
    public String getP_clave() {
        return p_clave;
    }

    /**
     * @param p_clave the p_clave to set
     */
    public void setP_clave(String p_clave) {
        this.p_clave = p_clave;
    }
    
    
    

   
}
