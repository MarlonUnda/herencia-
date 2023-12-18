/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.demo2.ejemploherencia2;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class Ejemploherencia2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresar el valor del radio");
        double radio;
        radio=leer.nextDouble();
        circulo2 circulo1=new circulo2(radio);
        System.out.println("el area del ciruclo es " +circulo1.CalcularArea());
        
        System.out.println("Ingrese el valor de la base y la altura");
        double altura;
        double base;
        altura=leer.nextDouble();
        base=leer.nextDouble();
        triangulo triangulo1=new triangulo(base,altura);
        System.out.println("El area del triangulo es" +triangulo1.CalcularArea());
        
        System.out.println("Ingrese los balores del ancho y largo ");
        double ancho;
        double largo;
        ancho=leer.nextDouble();
        largo=leer.nextDouble();
        rectangulo rectangulo1=new rectangulo(ancho,largo);
        System.out.println("El valor del area del rectangulo es:" +rectangulo1.CalcularArea());
    }
}
