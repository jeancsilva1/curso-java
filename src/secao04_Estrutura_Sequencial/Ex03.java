/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A:");
        int a = in.nextInt();
        System.out.print("B:");
        int b = in.nextInt();
        System.out.print("C:");
        int c = in.nextInt();
        System.out.print("D:");
        int d = in.nextInt();
        
        System.out.print("Diferenca: " + ((a * b) - (c * d)));
    }

}
