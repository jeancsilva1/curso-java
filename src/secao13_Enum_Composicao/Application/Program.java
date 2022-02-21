/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13_Enum_Composicao.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import secao13_Enum_Composicao.entities.Department;
import secao13_Enum_Composicao.entities.HourContract;
import secao13_Enum_Composicao.entities.Worker;
import secao13_Enum_Composicao.enums.WorkerLevel;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Department d;
        Worker worker;
        HourContract hc;

        System.out.print("Enter department's name:");
        String department = in.nextLine();
        d = new Department(department);

        System.out.println("Enter worker data:");

        System.out.print("Name:");
        String name = in.nextLine();

        System.out.print("Level:");
        String level = in.nextLine();

        System.out.print("Base Salary:");
        double baseSalary = in.nextDouble();
        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, d);

        System.out.print("How many contracts to this worker?");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            date = sdf.parse(in.nextLine());
            System.out.print("Value per hour:");
            double valuePerHour = in.nextDouble();
            in.nextLine();
            System.out.print("Duration (hours):");
            int duration = in.nextInt();
            in.nextLine();
            hc = new HourContract(date, valuePerHour, duration);
            worker.addContract(hc);

        }
        System.out.println("------------------Worker data and contracts----------------");
        System.out.println(worker);
        System.out.println("------------------Worker data and contracts----------------");

        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = in.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.print("Name: ");
        System.out.print(worker.getName() + "\n");
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": R$" + worker.income(year, month));

    }

}
