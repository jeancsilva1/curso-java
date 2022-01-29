/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Raio:");
        double raio = in.nextDouble();
        double area = Math.PI * raio * raio;
        System.out.printf("Area:%.4f " , area);
    }
}
