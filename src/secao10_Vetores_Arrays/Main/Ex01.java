/*
Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
 */
package secao10_Vetores_Arrays.Main;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N:");
        int n = in.nextInt();
        
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura " + (i+1) + ":");
            altura[i] = in.nextDouble();

        }
        double soma = 0;
         for (int i = 0; i < n; i++){
             soma += altura[i];
         }
         System.out.println(soma / altura.length);
    }

}
