/*
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida,
calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

 */
package secao04_Estrutura_Sequencial;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("A:");
        double a = in.nextDouble();
        System.out.print("B:");
        double b = in.nextDouble();
        System.out.print("C:");
        double c = in.nextDouble();
        
        double areaTriangulo = (a * c) /2;
        double areaCirculo = (Math.PI * c * c);
        double areaTrapezio = ((a + b) * c) /2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        
        System.out.printf("TRIANGULO: %.2f\n" , areaTriangulo);
        System.out.printf("CIRCULO: %.2f\n" , areaCirculo);
        System.out.printf("TRAPEZIO: %.2f\n" , areaTrapezio);
        System.out.printf("QUADRADO: %.2f\n" , areaQuadrado);
        System.out.printf("RETANGULO: %.2f\n" , areaRetangulo);
    }
    
}
