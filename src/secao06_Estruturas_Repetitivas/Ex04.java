/*
 Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N:");
        int n = in.nextInt();
        int fatorial =1;
        for(int i = 1; i <=n; i++){
            fatorial = fatorial*i;
            
        }
        System.out.println(fatorial);
    }
    
}
