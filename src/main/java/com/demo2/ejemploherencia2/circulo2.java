/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo2.ejemploherencia2;

/**
 *
 * @author labctr
 */
public class circulo2 extends figurageometrica {
private double radio; 
    
    public circulo2(double radio){
        this.radio=radio;
    }
    @Override
    public double CalcularArea() {
         radio=3.14*radio*radio;
        return area;  
    }
    
}
