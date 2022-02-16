/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.DAO.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import secao21_AcessoBancoDados_JDBC.DAO.SellerDAO;
import secao21_AcessoBancoDados_JDBC.db.DB;
import secao21_AcessoBancoDados_JDBC.db.DbException;
import secao21_AcessoBancoDados_JDBC.entities.Department;
import secao21_AcessoBancoDados_JDBC.entities.Seller;

/**
 *
 * @author Jean
 */
public class SellerDaoJDBC implements SellerDAO {
    
    private Connection conn;
    
    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
        
    }
    
    @Override
    public void insert(Seller obj) {
    }
    
    @Override
    public void update(Seller obj) {
    }
    
    @Override
    public void deleteById(Integer id) {
    }
    
    @Override
    public Seller findById(Integer id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "WHERE seller.Id = ?");
            
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                Department dep = new Department();
                dep.setId(rs.getInt("DepartmentId"));
                dep.setName(rs.getString("DepName"));
                
                Seller obj = new Seller();
                obj.setId(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                obj.setEmail(rs.getString("Email"));
                obj.setBirthDate(rs.getDate("BirthDate"));
                obj.setBaseSalary(rs.getDouble("BaseSalary"));
                obj.setDepartment(dep);
                return obj;
            }
            
        return null;
        }
        catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }
        finally{
        DB.closeStatement(pst);
        DB.closeResultSet(rs);
    }
    }
    
    @Override
    public List<Seller> findAll() {
        return null;
    }
    
}
