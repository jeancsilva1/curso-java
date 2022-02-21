/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao17_Arquivos.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jean
 */
public class Exemplo03 {

    public static void main(String[] args) {
         //Efetuando escrita em arquivo utilizando a classe BUFFEREDWRITTER E FILEWRITTER
        
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\temp\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Gravado no arquivo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
