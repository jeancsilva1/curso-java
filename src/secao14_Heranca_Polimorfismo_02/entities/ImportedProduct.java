/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo_02.entities;

/**
 *
 * @author Jean
 */
public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (Customs fee: R$ " + customsFee + ")";
    }

    public double totalPrice() {
        return super.getPrice() + customsFee;

    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(", R$ ");
        sb.append(super.getPrice());
        sb.append(" ");
        sb.append("Customs Fee:" + customsFee);
        sb.append(" \n");
        return sb.toString();
    }
}
