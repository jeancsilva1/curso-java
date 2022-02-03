/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao17_Arquivos.Application;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Exemplo04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //MANIPULANDO PASTAS

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());
        sc.close();
    }

}
