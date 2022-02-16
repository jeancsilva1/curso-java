/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import java.util.List;
import secao21_AcessoBancoDados_JDBC.DAO.DAOFactory;
import secao21_AcessoBancoDados_JDBC.DAO.SellerDAO;
import secao21_AcessoBancoDados_JDBC.entities.Department;
import secao21_AcessoBancoDados_JDBC.entities.Seller;

/**
 *
 * @author Jean
 */
public class Program {
    public static void main(String[] args) {
       
        SellerDAO sellerDAO = DAOFactory.createSellerDao();
        Seller seller = sellerDAO.findById(3);
        System.out.println("=== Test 1: findById ===");
        System.out.println(seller);
        
         System.out.println("\n=== Test 2: findByDepartment ===");
         Department department = new Department(2, null);
         List<Seller> list = sellerDAO.findByDepartment(department);
         for (Seller obj : list) {
             System.out.println(obj);
            
        }
    }
    
}
