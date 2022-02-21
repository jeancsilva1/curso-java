/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import secao21_AcessoBancoDados_JDBC.db.DB;

/**
 *
 * @author Jean
 */
public class Insert {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "insert into seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + " values (?,?,?,?,?)");
            
            pst.setString(1, "Jean");
            pst.setString(2, "jean@jean.com.br");
            pst.setDate(3, new java.sql.Date(sdf.parse("05/11/1992").getTime()));
            pst.setDouble(4, 5000);
            pst.setInt(5, 4);
            
            pst.executeUpdate();
            System.out.println("Registro Inserido!");

        }
    catch(SQLException e){
    e.printStackTrace();
    }
        catch(ParseException e){
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }

}
