/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao20_ProgramacaoFuncional.util;

import java.util.function.Predicate;
import secao20_ProgramacaoFuncional.entities.Product;

/**
 *
 * @author Jean
 */
public class MyPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >=100;
    }
    
}
