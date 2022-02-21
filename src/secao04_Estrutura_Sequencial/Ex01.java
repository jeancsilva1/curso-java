/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.print("A:");
        int a = in.nextInt();
        System.out.print("B:");
        int b = in.nextInt();
        int soma = a + b;
        System.out.println("Soma: " + soma);

    }

}
