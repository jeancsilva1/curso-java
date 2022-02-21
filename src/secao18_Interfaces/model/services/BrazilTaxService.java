/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao18_Interfaces.model.services;

/**
 *
 * @author Jean
 */
public class BrazilTaxService implements TaxService{
 public double tax(double amount){
        if(amount <= 100){
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }   
    
}
