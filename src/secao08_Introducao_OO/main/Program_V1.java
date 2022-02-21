/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao08_Introducao_OO.main;

import java.util.Scanner;
import secao08_Introducao_OO.entities.Product;

/**
 *
 * @author Jean
 */
public class Program_V1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name:");
        product.name = in.nextLine();
        System.out.print("Price:");
        product.price = in.nextDouble();
        System.out.print("Quntity in Stock:");
        product.quantity = in.nextInt();
        
      
        System.out.print("Product data: " + product.name
                + ", $" + product.price + ", "
                + product.quantity + " units, "
                + "Total: $"
                + product.totalValueInStock());
        System.out.println("");
        
        System.out.print("Enter the number of products to be added in stock:");
        product.addProducts(in.nextInt());
        
       System.out.print("Updated data: " + product.name
                + ", $" + product.price + ", "
                + product.quantity + " units, "
                + "Total: $"
                + product.totalValueInStock());
        System.out.println("");
        
         System.out.print("Enter the number of products to be removed in stock:");
        product.removeProducts(in.nextInt());
        
       System.out.print("Updated data: " + product.name
                + ", $" + product.price + ", "
                + product.quantity + " units, "
                + "Total: $"
                + product.totalValueInStock());
        System.out.println("");
    }
}
