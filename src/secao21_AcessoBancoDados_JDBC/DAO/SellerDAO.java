/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.DAO;

import java.util.List;
import secao21_AcessoBancoDados_JDBC.entities.Department;
import secao21_AcessoBancoDados_JDBC.entities.Seller;

/**
 *
 * @author Jean
 */
public interface SellerDAO {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}
