/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.sql.Connection;
import secao21_AcessoBancoDados_JDBC.db.DB;

/**
 *
 * @author Jean
 */
public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        
        DB.closeConnection();
    }
    
}
