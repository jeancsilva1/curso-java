/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo_02.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jean
 */
public class UsedProduct extends Product {

    private Date manufacturedDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public UsedProduct(Date manufacturedDate, String name, Double price) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag() {
        return super.getName()
                + "(used) R$ "
                + super.getPrice()
                + "(Manufacture date: " + sdf.format(manufacturedDate) + ")";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(", R$ ");
        sb.append(super.getPrice());
        sb.append(" ");
        sb.append("Manufactured Date:" + sdf.format(manufacturedDate) + ")");
        sb.append(" \n");
        return sb.toString();
    }

}
