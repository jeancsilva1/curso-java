/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao02_Conceitos;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex02 {
    public static void main(String[] args) {
        
        //Adicionando Scanner para entrada de dados via teclado na console
        Scanner sc = new Scanner (System.in);
        
        
        int a, b, soma;
        
        /*atribuição de valores sem utilizar a classe Scanner
        a = 10;
        b = 20;
        */
        
        //atribuindo valores utilizando a classe Scanner 
        System.out.print("A:");
        a = sc.nextInt();
        System.out.print("B:");
        b = sc.nextInt();
        soma = a + b; 
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Soma: " + soma);
        
    }
    
}
