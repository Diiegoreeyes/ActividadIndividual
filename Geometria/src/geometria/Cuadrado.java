/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Cuadrado implements FiguraGeometrica
{
    /**
     * Atributo de tipo numérico que guarda parte decimal y entera en memoria que 
     * contiene el valor del lado
     */
    private double lado;
        /**
     * Atributo de tipo numérico que guarda parte decimal y entera en memoria que 
     * contiene el valor del área
     */
    private double areaCuadrado;

    /**
     * Constructor de la clase Cuadrado
     * @param lado valor del lado del cuadrado asociado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Metodo consultor del atributo lado del cuadrado asociado
     * @return valor del lado del cuadrado asociado
     */
    public double getLado() 
    {
        return lado;
    }
    /**
     * Metodo modificador del atributo lado.
     * @param radio valor del lado del cuadrado asociado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Metodo consultor del atributo área del cuadrado asociado
     * @return valor del area del cuadrado asociado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }        
   /**
    * Metodo modificador del atributo área del cuadrado asociado
    */ 
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}
