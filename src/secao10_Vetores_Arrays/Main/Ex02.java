/*
Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
 */
package secao10_Vetores_Arrays.Main;

import java.util.Scanner;
import secao10_Vetores_Arrays.entities.Product;

/**
 *
 * @author Jean
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Number of products: ");
        int n = in.nextInt();
        in.nextLine();
        Product p = new Product();
        Product[] product = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name of Product " + (i + 1) + ":");
            p.setNome(in.nextLine());
            System.out.print("Price of Product " + (i + 1) + ":");
            p.setPreco(in.nextDouble());
            in.nextLine();
            product[i] = new Product(p.getNome(), p.getPreco());

        }
        for (Product p1 : product) {
            System.out.println(p1);
        }

        double soma = 0;
        for (Product p1 : product) {
            soma += p1.getPreco();
        }
        System.out.println("Average Price: " + soma / product.length);
        
    }

}
