/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo2.ejemploherencia2;

/**
 *
 * @author labctr
 */
public class triangulo extends figurageometrica {
    private double base; 
    private double altura;
   
    public triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double CalcularArea() {
       area=(base*altura)/2;
        return area;
    }
}
