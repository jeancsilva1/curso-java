/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo_02.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import secao14_Heranca_Polimorfismo_02.entities.ImportedProduct;
import secao14_Heranca_Polimorfismo_02.entities.Product;
import secao14_Heranca_Polimorfismo_02.entities.UsedProduct;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        Product p = new Product();

        System.out.print("Enter the number of products:");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char resp = in.next().charAt(0);
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Price: ");
            double price = in.nextDouble();
            in.nextLine();

            if (resp == 'i') {
                System.out.print("Customs fee: ");
                double customFee = in.nextDouble();
                p = new ImportedProduct(customFee, name, (price + customFee));
                
                list.add(p);
            } else if (resp == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date dateManufacture = sdf.parse(in.nextLine());
                p = new UsedProduct(dateManufacture, name, price);
                list.add(p);
            }
            else {
                p = new Product(name, price);
                list.add(p);
            }
            
            
            

        }
        System.out.println("PRICE TAGS");
            for (Product product : list) {
                System.out.print(product);
                System.out.print("");
            }

    }
}
