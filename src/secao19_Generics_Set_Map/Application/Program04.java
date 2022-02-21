/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao19_Generics_Set_Map.Application;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jean
 */
public class Program04 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.removeIf(x -> x.charAt(0) == 'T');
        System.out.println(set.contains("Notebook"));
        
        for (String p : set) {
            System.out.println(p);
        }
    }

}
