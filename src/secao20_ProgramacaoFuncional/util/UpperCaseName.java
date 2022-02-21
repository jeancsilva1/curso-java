/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao20_ProgramacaoFuncional.util;
import java.util.function.Function;
import secao20_ProgramacaoFuncional.entities.Product;
/**
 *
 * @author Jean
 */
public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
        
    }
    
    
}
