/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.Application;

import secao21_AcessoBancoDados_JDBC.DAO.DAOFactory;
import secao21_AcessoBancoDados_JDBC.DAO.SellerDAO;
import secao21_AcessoBancoDados_JDBC.entities.Seller;

/**
 *
 * @author Jean
 */
public class Program {
    public static void main(String[] args) {
       
        SellerDAO sellerDAO = DAOFactory.createSellerDao();
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
    
}
