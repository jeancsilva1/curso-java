/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.DAO;

import java.util.List;
import secao21_AcessoBancoDados_JDBC.entities.Department;

/**
 *
 * @author Jean
 */
public interface DepartmentDAO {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
