/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo2.ejemploherencia2;

public class rectangulo extends figurageometrica {
    private double largo; 
    private double ancho;
    public rectangulo(double base,double altura){
        this.largo=largo;
        this.ancho=ancho;
    }
    
    @Override
    public double CalcularArea() {
         area=ancho*largo;
        return area;
    } 
}
