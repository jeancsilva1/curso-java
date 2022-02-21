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
import secao21_AcessoBancoDados_JDBC.db.DbIntegrityException;

/**
 *
 * @author Jean
 */
public class Delete {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?");

            pst.setInt(1, 2);
            int rowsAffected = pst.executeUpdate();

            System.out.println("Registro Excluído! Rows Affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }

    }

}
