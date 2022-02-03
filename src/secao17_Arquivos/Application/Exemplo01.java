/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao17_Arquivos.Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Exemplo01 {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\a.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }

}
