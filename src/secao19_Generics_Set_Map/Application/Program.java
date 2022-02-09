/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao19_Generics_Set_Map.Application;

import java.util.Scanner;
import secao19_Generics_Set_Map.services.PrintService;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        System.out.print("How many values?");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i++) {

            ps.addValue(in.nextInt());
            in.nextLine();
        }

        ps.print();
        System.out.println("");
        System.out.println("First:" + ps.first());

    }
}
