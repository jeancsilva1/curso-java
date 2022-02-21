/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import secao21_AcessoBancoDados_JDBC.db.DB;
import secao21_AcessoBancoDados_JDBC.db.DbException;

/**
 *
 * @author Jean
 */
public class Transaction {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartementId = 1");
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartementId = 2");
            conn.commit();
            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);
            
        } catch (SQLException e) {
            
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused By" + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused By: " + ex.getMessage());

            }
            
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }

}
