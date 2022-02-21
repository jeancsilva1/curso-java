/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo_03.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao14_Heranca_Polimorfismo_03.entities.Circle;
import secao14_Heranca_Polimorfismo_03.entities.Rectangle;
import secao14_Heranca_Polimorfismo_03.entities.Shape;
import secao14_Heranca_Polimorfismo_03.enums.Color;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes:");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char resp = in.next().charAt(0);
            in.nextLine();
            System.out.print("Color (BLACK/BLUE/RED):");
            String color = in.nextLine();
            if (resp == 'c') {
                System.out.print("Radius:");
                double radius = in.nextDouble();
                list.add(new Circle(radius, Color.valueOf(color)));

            } else {
                System.out.print("Width:");
                double width = in.nextDouble();
                System.out.print("Heigth:");
                double height = in.nextDouble();
                list.add(new Rectangle(width, height, Color.valueOf(color)));
            }

        }
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(shape.area());
        }
    }

}
