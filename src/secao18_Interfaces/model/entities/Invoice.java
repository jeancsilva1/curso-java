/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao18_Interfaces.model.entities;

/**
 *
 * @author Jean
 */
public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

  

    public Invoice() {
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    
    public Double totalPayment(){
        return getBasicPayment() + getTax();
    }
    
}
