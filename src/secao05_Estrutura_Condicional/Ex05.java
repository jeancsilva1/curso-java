/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

CODIGO       ESPECIFICAÇÃO          PREÇO
1            CACHORRO QUENTE        R$ 4,00
2            X-SALADA               R$ 4,50
3            X-BACON                R$ 5,00
4            TORRADA SIMPLES        R$ 2,00
5            REFRIGERANTE           R$ 1,50  
 */
package secao05_Estrutura_Condicional;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cachorro_quente = 4;
        double x_salada = 4.50;
        double x_bacon = 5;
        double torrada = 2;
        double refrigerante = 1.50;
        int cod, qtd;
        double total;

        System.out.print(
                "Codigo do produto: ");
        cod = in.nextInt();

        System.out.print(
                "Quantidade: ");
        qtd = in.nextInt();

        if (cod == 1) {
            total = qtd * cachorro_quente;
            System.out.println("Total R$ " + total);
        } else if (cod == 2) {
            total = qtd * x_salada;
            System.out.println("Total R$ " + total);
        } else if (cod == 3) {
            total = qtd * x_bacon;
            System.out.println("Total R$ " + total);
        } else if (cod == 4) {
            total = qtd * torrada;
            System.out.println("Total R$ " + total);
        } else if (cod == 5) {
            total = qtd * refrigerante;
            System.out.println("Total R$ " + total);
        }

    }
}
