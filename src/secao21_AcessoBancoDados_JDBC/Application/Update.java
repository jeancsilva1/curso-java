/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import secao21_AcessoBancoDados_JDBC.db.DB;

/**
 *
 * @author Jean
 */
public class Update {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)");

            pst.setDouble(1, 200);
            pst.setInt(2, 2);
            
            int rowsAffected = pst.executeUpdate();
            System.out.println("Dados Atualizados! Rows Affected:  " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
