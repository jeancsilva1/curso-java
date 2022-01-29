/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha = 2002;
        System.out.print("Senha:");
        int entrada = in.nextInt();
        
        while (entrada != senha) {
            System.out.println("Senha Inválida:");
            System.out.print("Senha:");
            entrada = in.nextInt();
            
        }
        System.out.println("Acesso Permitido");
    }

}
