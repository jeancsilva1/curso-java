/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao19_Generics_Set_Map.Application;

import secao19_Generics_Set_Map.entities.Client;

/**
 *
 * @author Jean
 */
public class Program03 {
    
    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1.getNome() == c2.getNome());
        
        
    }
    
}
