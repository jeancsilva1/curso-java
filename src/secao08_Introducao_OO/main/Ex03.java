/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */
package secao08_Introducao_OO.main;

import java.util.Scanner;
import secao08_Introducao_OO.entities.Student;

/**
 *
 * @author Jean
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();
        student.name = in.nextLine();
        student.nota1 = in.nextDouble();
        student.nota2 = in.nextDouble();
        student.nota3 = in.nextDouble();
        student.somaNotas(student.nota1, student.nota2, student.nota3);
        student.aprovado();
        System.out.println(student);
        System.out.println(student.aprovado());
        
        
    }
    
}
