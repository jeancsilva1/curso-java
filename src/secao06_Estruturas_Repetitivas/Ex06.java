/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex06 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("N:");
         int n = in.nextInt();
         for(int i = 1; i<=n; i++){
             System.out.print(i +" " + i*i + " " + i*i*i);
             System.out.println("");
         }
    }
    
}
