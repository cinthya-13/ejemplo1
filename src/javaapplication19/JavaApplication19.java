/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author ISTLOJAV
 */
public class JavaApplication19 {

    public static void main(String[] args) {
        String cadena = "la sombrilla";
        int index = cadena.indexOf("a");
        System.out.println(cadena.concat("que hace"));
        System.out.println(cadena);
        System.out.println (cadena.contains("a,e,i,o,u"));
        int contarA = 0;
        String buscar = "122267373378";
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i) + "posicion" + i);
            if (buscar.contains(cadena.charAt(i) + "")) {
                System.out.println("(encontre una A");
                contarA++;
            } else {
                System.out.println("no encomtre ninguna A");
            }
        }
        System.out.println("El numero total de numeros es " + contarA);
        String vocales = "AEIOUaeiou";
        String consonantes = "SDFGHJKLQWORTYPZXCVBNMsdfghjklqwrtypzxcvbnm";
        int contarvocales = 0, contarconsonantes = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.contains(cadena.charAt(i) + "")) {
                contarvocales++;
            }
            if (consonantes.contains(cadena.charAt(i) + "")) {
                contarconsonantes++;
            }
        }
         System.out.println("vocales" + contarvocales + "consonantes" + contarconsonantes);
        System.out.println(cadena.replace("a","o"));
        
    }
}
