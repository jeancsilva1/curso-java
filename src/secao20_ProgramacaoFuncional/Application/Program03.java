/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao20_ProgramacaoFuncional.Application;

import java.util.ArrayList;
import java.util.List;
import secao20_ProgramacaoFuncional.entities.Product;
import secao20_ProgramacaoFuncional.util.PriceUpdate;

/**
 *
 * @author Jean
 *
 * Exemplo com Consumer
 */
public class Program03 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tablet", 150.0));
        list.add(new Product("Computer", 800.0));
        list.add(new Product("Iphone", 700.0));
        list.add(new Product("Mouse", 50.0));
        
        list.forEach(new PriceUpdate());
        
        list.forEach(System.out::println);

    }

}
