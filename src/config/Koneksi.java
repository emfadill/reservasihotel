package config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dosen
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Koneksi {
    
     public static Connection conn;
    
    public static Connection Conn()
    {
        if (conn == null) 
        {
            try 
            {
                String url="jdbc:mysql://localhost:3306/db_reservasihotel";
                String user="root"; //user mysql
                String password=""; //password mysql

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url,user,password);
            }
            catch (SQLException e)
            {
            System.out.println(e.getMessage());
            }
        }
        return conn;
    }
    
      public static void main(String args[])
    {
        System.out.println(Koneksi.Conn());
    }
}
