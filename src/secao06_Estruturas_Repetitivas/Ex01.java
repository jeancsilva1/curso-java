/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Num: ");
        int num = in.nextInt();
        while (!(num >= 1 && num <= 1000)) {
            System.out.print("Numero fora do intervalo (1 - 1000): \n");
             System.out.print("Num: ");
            num = in.nextInt();
        }
            for (int i = 0; i <= num; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

    }

