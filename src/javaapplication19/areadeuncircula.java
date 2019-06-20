/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Locale;
import java.util.Scanner;

public class areadeuncircula {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        System.out.println("Escribe el valor del Radio:");
        L.useLocale(Locale.US);
        float Radio;
        float Area;
        Radio = L.nextFloat();
        Area = (float) (3.1416 * Math.pow(Radio, 2));
        System.out.println("El Area del Circulo es:" + Area);
    }
}
