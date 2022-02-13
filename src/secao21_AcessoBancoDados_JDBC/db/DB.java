/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao21_AcessoBancoDados_JDBC.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Jean
 */
public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {

                //Usando arquivo db.properties
                Properties props = loadProperties();
                String url = props.getProperty("dburl");

                /*
                //Usando String com dados da conexão
                String url = "jdbc:mysql://localhost:3306/coursejdbc";
                String user = "developer";
                String password = "1234567";
                 */
                conn = DriverManager.getConnection(url, props);
                System.out.println("Conectado");
                

            } catch (SQLException e) {
                System.out.println("Erro ao conectar");
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    //*** METODO PARA ABRIR ARQUIVO DB.PROPERTIES E CAPTURAR DADOS DA CONEXÃO
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException((e.getMessage()));
        }

    }

}
