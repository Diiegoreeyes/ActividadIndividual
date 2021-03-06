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
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    
    public Circulo(double radio) 
    {
        this.radio = radio;
    }
    /**
     * Método consultor del atributo radio
     * @return valor del radio del circulo asociado
     */
    public double getRadio() 
    {
        return radio;
    }
    /**
     * Metodo modificador del atributo radio.
     * @param radio valor del radio del círculo asociado
     */
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    /**
     * Método consultor del atributo área
     * @return valor del área del circulo asociado
     */
    public double getAreaRadio() 
    {
        return areaRadio;
    }

   /**
    * Metodo modificador del atributo área del círculo asociado
    */ 
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
