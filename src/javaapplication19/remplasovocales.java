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
public class remplasovocales {
     public static void main(String[] args) {
        System.out.println("escriba un texto");
        Scanner entrada = new java.util.Scanner (System.in);
        String valor;
        valor = entrada.next();
        int contabilizador=0;
        for(int k=0;k<valor.length();k++){
            contabilizador ++;
            
        }
       if(contabilizador<=10){
                System.out.println(valor.replace("e","u"));
            }else{
                System.out.println(valor.replace("o","e"));
            }     
}
}
