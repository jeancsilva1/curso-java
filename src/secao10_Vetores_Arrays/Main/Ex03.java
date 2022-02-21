/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */
package secao10_Vetores_Arrays.Main;

import java.util.Scanner;
import secao10_Vetores_Arrays.entities.Student;

/**
 *
 * @author Jean
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int n = in.nextInt();
        in.nextLine();
        Student[] student = new Student[10];

        for (int i = 1; i <= n; i++) {

            System.out.println("Rent #" + i);
            System.out.print("Name:");
            String name = in.nextLine();
            System.out.print("Email:");
            String email = in.nextLine();
            System.out.print("Room:");
            int room = in.nextInt();
            in.nextLine();
            student[room] = new Student(name, email);

        }
        System.out.println("Busy rooms:");
        for (int i = 1; i < student.length; i++) {
            if (student[i] != null) {
                System.out.print(i + ": " + student[i]);
            }

        }
    }

}
