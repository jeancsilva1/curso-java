/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num:");
        int n = sc.nextInt();
        int x, in = 0, out = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Num " + i + ":");
            x = sc.nextInt();
            if(x >= 10 && x < 20){
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println(in + " In");
        System.out.println(out + " Out");
        
    }
}
