/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao15_Exceptions.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Introducao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("data: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("position: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position! " + e);
        } catch (InputMismatchException e) {
            System.out.println("Input error " + e);
        }
        System.out.println("End of program ");
        sc.close();
    }

}
