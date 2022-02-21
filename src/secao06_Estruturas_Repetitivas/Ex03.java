/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
package secao06_Estruturas_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Ex03 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("n:");
         double a, b;
         int n = in.nextInt();
         for(int i = 0; i<n; i++){
             System.out.print("a: ");
             a = in.nextDouble();
             System.out.print("b: ");
             b = in.nextDouble();
             if(b == 0){
                 System.out.println("Divisao Impossivel");
             }
             else {
                 System.out.println(a/b);
             }
             
         }
    }
    
}
