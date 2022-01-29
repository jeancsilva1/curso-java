/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
package secao05_Estrutura_Condicional;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Num:");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
    }

}
