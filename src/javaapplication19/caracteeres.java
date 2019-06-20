/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;
/**
 *
 * @author ISTLOJAV
 */
public class caracteeres {
    public static void main(String[] args) {
        System.out.println("escriba un texto");
        Scanner entrada = new Scanner (System.in);
        String valor;
        valor = entrada.next();
        String vocales = "AEIOUaeiou";
        String consonantes = "SDFGHJKLQWORTYPZXCVBNMsdfghjklqwrtypzxcvbnm";
        int contarvocales = 0, contarconsonantes = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (vocales.contains(valor.charAt(i) + "")) {
                contarvocales++;
            }
            if (consonantes.contains(valor.charAt(i) + "")) {
                contarconsonantes++;
            }
        
    }
    System.out.println("vocales" + contarvocales + "consonantes" + contarconsonantes);
    String mayus = "AEIOUSDFGHJKLQWORTYPZXCVBNM";
        String minus = "aeiousdfghjklqwrtypzxcvbnm";
        int contarmayus = 0, contarminus = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (mayus.contains(valor.charAt(i) + "")) {
                contarmayus++;
            }
            if (minus.contains(valor.charAt(i) + "")) {
                contarminus++;
            }
        
    }
    System.out.println("mayusculas" + contarmayus + "minusculas" + contarminus);
}
}
