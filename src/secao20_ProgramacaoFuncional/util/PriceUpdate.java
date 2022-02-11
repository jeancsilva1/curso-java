/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao20_ProgramacaoFuncional.util;

import java.util.function.Consumer;
import secao20_ProgramacaoFuncional.entities.Product;

/**
 *
 * @author Jean
 */
public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
}
