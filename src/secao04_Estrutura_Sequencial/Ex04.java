/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero do Funcionário: ");
        int numFuncionario = in.nextInt();
        System.out.print("Horas trabalhadas: ");
        double horasTrabalhadas = in.nextDouble();
        System.out.print("Valor Hora: ");
        double valorHora = in.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        
        System.out.println("Numero: " + numFuncionario);
        System.out.println("Salario: " + salario);

    }

}
