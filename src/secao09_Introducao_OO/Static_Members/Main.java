/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */
package secao09_Introducao_OO.Static_Members;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is the dollar price?");
        double dollarPrice = in.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amountReal = in.nextDouble();
        
        System.out.print("Amount to be paid in real = " +CurrencyConverter.dollarToReal(dollarPrice, amountReal));
    }
}
