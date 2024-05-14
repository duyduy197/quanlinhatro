/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Dbsql {
     private Connection connection;

    public Connection openConnection() {
        //Thong tin ket noi den SQLSever
        String url = "jdbc:sqlserver://Macos:1433;databaseName=QLNhaTro";
        String username = "sa";
        String pass = "232197";
        try {
            //load driver JDBC cho SQL server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Tao ket noi
            connection = DriverManager.getConnection(url, username, pass);
            // Thuc hien thao tac (thuong se dung mot class khac)
            if (connection != null) {
                System.out.println("connection complete");
            } else {
                System.out.println("connection null");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
