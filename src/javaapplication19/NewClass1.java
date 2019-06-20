/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class NewClass1 {
    public static void main(String[] args) {
        String a = "dia";
        System.out.println("ingresa la segunda palabra");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        if (Objects.equals (a,b)){
            System.out.println("son iguales");
            } else {
            System.out.println("no son iguales");
        }
    }
    
}
