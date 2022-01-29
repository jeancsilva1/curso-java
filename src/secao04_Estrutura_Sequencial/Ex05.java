/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Codigo peça 01: ");
        int cod01 = in.nextInt();
        System.out.print("Numero peça 01: ");
        int numPeca01 = in.nextInt();
        System.out.print("Valor Unitário:");
        double valorUnit = in.nextDouble();
        
         System.out.print("Codigo peça 02: ");
        int cod02 = in.nextInt();
        System.out.print("Numero peça 02: ");
        int numPeca02 = in.nextInt();
        System.out.print("Valor Unitário:");
        double valorUnit2 = in.nextDouble();
        
        double valorAPagar = (numPeca01 * valorUnit) + (numPeca02 * valorUnit2);
        
        System.out.printf("Valor a pagar: R$ %.2f ", valorAPagar );
    }

}
