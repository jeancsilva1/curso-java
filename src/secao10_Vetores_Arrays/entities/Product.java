/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10_Vetores_Arrays.entities;

/**
 *
 * @author Jean
 */
public class Product {
    private String nome;
    private Double preco;

    public Product() {
    }

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Product{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    
    
}
