/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author saski
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
    
                String url = "jdbc:mysql://localhost:3306/mahasiswa_db";
    
                String user = "root";
                String password = "Saskia@05";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException one) {
                System.out.println("Gagal load driver : " + one.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}