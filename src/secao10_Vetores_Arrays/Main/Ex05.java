/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
 */
package secao10_Vetores_Arrays.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao10_Vetores_Arrays.entities.Employee;

/**
 *
 * @author Jean
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many employees will be registered?");
        int n = in.nextInt();
        in.nextLine();
        List<Employee> list = new ArrayList();
        Employee employee = new Employee();

        for (int i = 1; i <= n; i++) {
            System.out.println("Emplyoee #" + i + ":");
            System.out.print("Id:");
            int id = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Salary: ");
            double salary = in.nextDouble();
            employee = new Employee(id, name, salary);
            list.add(employee);

        }
        System.out.print("Enter the employee id that will have salary increase :");
        int id = in.nextInt();
        employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage:");
            double percent = in.nextDouble();
            employee.increaseSalary(percent);
        }
        System.out.println("List of Employees:");
        for (Employee employee1 : list) {
            System.out.println(employee1);

        }
    }

}
