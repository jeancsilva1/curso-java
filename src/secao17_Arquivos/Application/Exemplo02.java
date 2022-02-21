/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao17_Arquivos.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jean
 */
public class Exemplo02 {

    public static void main(String[] args) {
        //Efetuando leitura de arquivos utilizando a classe BUFFEREDREADER E FILEREADER
        String path = "C:\\temp\\a.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }

}
