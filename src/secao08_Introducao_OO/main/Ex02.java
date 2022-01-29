/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
 */
package secao08_Introducao_OO.main;

import java.util.Scanner;
import secao08_Introducao_OO.entities.Employee;

/**
 *
 * @author Jean
 */
public class Ex02 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Employee employee = new Employee();
         System.out.print("Name:");
         employee.name = in.nextLine();
         System.out.print("Gross Salary:");
         employee.GlossSlary = in.nextDouble();
         System.out.print("Tax:");
         employee.tax = in.nextDouble();
         
         System.out.println(employee);
         
         System.out.print("Which percentage to increase salary?");
         employee.increaseSalary(in.nextDouble());
         
         System.out.print("Updated data: " + employee +"\n");
    }
 
}
