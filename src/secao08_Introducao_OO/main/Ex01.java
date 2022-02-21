/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
 */
package secao08_Introducao_OO.main;

import java.util.Scanner;
import secao08_Introducao_OO.entities.Rectangle;

/**
 *
 * @author Jean
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = in.nextInt();
        rectangle.height = in.nextInt();
        
        System.out.println("AREA: " + rectangle.area());
        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("DIAGONAL: " + rectangle.diagonal());
    }
}
