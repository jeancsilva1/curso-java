/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.DAO;

import java.sql.Connection;
import secao21_AcessoBancoDados_JDBC.DAO.implement.SellerDaoJDBC;
import secao21_AcessoBancoDados_JDBC.db.DB;


/**
 *
 * @author Jean
 */
public class DAOFactory {
    
    public static SellerDAO createSellerDao(){
        //Connection conn = DB.getConnection();
        
        return new SellerDaoJDBC(DB.getConnection());
    }
    
}
