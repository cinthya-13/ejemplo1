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
public class cuentasuscaracteres {
    public static void main(String[] args) {
        System.out.println("escriba un texto");
        Scanner entrada = new Scanner (System.in);
        String valor;
        valor = entrada.next;
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
}
}
