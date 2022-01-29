/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
package secao05_Estrutura_Condicional;

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
        if(num < 0 ){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }
    }
    
}
