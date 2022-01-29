/*
Ler um número inteiro N e calcular todos os seus divisores.
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N:");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                System.out.println(n / i);
            }
        }
    }
    
}
