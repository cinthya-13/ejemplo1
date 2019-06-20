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
public class NewClass {

    public static void main(String[] args) {
         int num1 = 6;
    int num2 = 4 ;
    int suma1 = Math.addExact(num1,num2);
    System.out.println(suma1);
        System.out.println(Math.ceil(23.5));
//       System.out.println(Math.round(23.5)); 
        int n1 = 12;
        int n2 = 5;
         int resultado = Math.min(n1, n2);
//         min para el menor, main para el mayor 
         System.out.println(resultado);
        pow es elevado a la potencia math es el q da el valor
        System.out.println("elevar 5 a la potencia 8"+"resultado"+Math.pow(5, 8));
        sql indica la rais cuadrada
        System.out.println("la rais cuadrada de 5000 es:"+ Math.sqrt(5000));
        SUBTRATEXACT NOS DA EL VALOR DE3 LOS NUMEROS
        int n1 = 0;
        int n2 = 7;
        int resta = Math.subtractExact(n1 , n2);
        System.out.println(resta);
        System.out.println(Math.cos(25));
        System.out.println(Math.asin(30));
        System.out.println(Math.tan(25));
                
    }

}
