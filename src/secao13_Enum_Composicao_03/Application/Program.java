/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13_Enum_Composicao_03.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import secao13_Enum_Composicao_03.Enums.OrderStatus;
import secao13_Enum_Composicao_03.entities.Client;
import secao13_Enum_Composicao_03.entities.Order;
import secao13_Enum_Composicao_03.entities.OrderItem;
import secao13_Enum_Composicao_03.entities.Product;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String name = in.nextLine();

        System.out.print("Email:");
        String email = in.nextLine();

        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(in.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = in.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
        OrderItem orderItem = null;
        Product product = null;

        System.out.print("How many items to this order? ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = in.nextLine();
            System.out.print("Product price:");
            double productPrice = in.nextDouble();
            System.out.print("Quantity:");
            int quantity = in.nextInt();
            in.nextLine();
            product = new Product(productName, productPrice);
            orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);

        }

        System.out.println("ORDER SUMMARY");
        System.out.print(order);

    }
}
