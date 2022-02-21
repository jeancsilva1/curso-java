/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao09_Introducao_OO.Static_Members;

/**
 *
 * @author Jean
 */
public class CurrencyConverter {
    
   public static double IOF = 0.06;
   
   public static double dollarToReal(double amount, double valorDollar){
       double totalValue = amount * valorDollar * (1 +IOF);
       return totalValue; 
   }
    
    
}
