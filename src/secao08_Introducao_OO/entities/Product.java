/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao08_Introducao_OO.entities;

/**
 *
 * @author Jean
 */
public class Product {
    public String name;
    public Double  price;
    public Integer quantity;

    
    public double totalValueInStock(){
        return price * quantity;
    }    
    
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $" + price + ", " + quantity + " units ," + "$" +totalValueInStock();
    }
    
    
}
