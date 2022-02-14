/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import secao21_AcessoBancoDados_JDBC.db.DB;

/**
 *
 * @author Jean
 */
public class Select {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
            System.out.println("ID - NAME");
            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeConnection();
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }
    
}
