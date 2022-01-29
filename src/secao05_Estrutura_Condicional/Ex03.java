/*
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
package secao05_Estrutura_Condicional;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("A:");
        a = in.nextInt();
        in.nextLine();
        System.out.print("B:");
        b = in.nextInt();
        
        if(a % b == 0 || b % a == 0){
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }
    }
    
}
