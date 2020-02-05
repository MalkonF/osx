package br.com.osx.dal;

import java.sql.*;

/**
 * @author Malkon F
 */
public class ModuloConexao {

    public static Connection conector() {

        Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "123";

        try {

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);

            return conexao;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
