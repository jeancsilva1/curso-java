/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.DAO;

import secao21_AcessoBancoDados_JDBC.DAO.implement.SellerDaoJDBC;

/**
 *
 * @author Jean
 */
public class DAOFactory {
    
    public static SellerDAO createSellerDao(){
        return new SellerDaoJDBC();
    }
    
}
