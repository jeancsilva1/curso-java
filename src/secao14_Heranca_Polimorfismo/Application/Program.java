/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao14_Heranca_Polimorfismo.entities.Employee;
import secao14_Heranca_Polimorfismo.entities.OutsourcedEmployee;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of employees:");
        Employee emp = new Employee();
        List<Employee> listEmp = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + "data:");
            System.out.print("Outsourced (y/n)?");
            char resp = in.next().charAt(0);
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            in.nextLine();
            System.out.print("Value Per Hours: ");
            double valuePerhour = in.nextDouble();
            emp = new Employee(name, hours, valuePerhour);

            if (resp == 'y') {
                System.out.print("Additional charge:");
                double additionalCharge = in.nextDouble();
                emp = new OutsourcedEmployee(additionalCharge, name, hours, valuePerhour);

            }
            listEmp.add(emp);
        }
        System.out.println("PAYMENTS:");
        for (Employee employee : listEmp) {
            System.out.print(employee.getName() + " - R$");
            System.out.print(employee.payment());
            System.out.println("");
        }

        in.close();
    }

}
