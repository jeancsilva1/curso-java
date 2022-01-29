/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */
package secao05_Estrutura_Condicional;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio, termino, duracao;
        System.out.print("Inicio:");
        inicio = in.nextInt();
        System.out.print("Termino:");
        termino = in.nextInt();
        if(inicio > termino){
            duracao = 24 - inicio + termino;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        }
        else if (inicio == termino){
            System.out.println("O jogo durou 24 horas");
        }
        else {
            duracao = termino - inicio;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        }
    }

}
