/*
 * Nama File : MysqlMahasiswaService.java
 * Deskripsi : Implementasi MahasiswaService untuk MySQL
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 22 Mei 2025
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;

/**
 *
 * @author saski
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = getConnection(); 
    }
    
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    public void add (String nama) throws SQLException {
        String query = "INSERT INTO mahasiswa_db (nama) VALUES ("+nama+")";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
    public void update (Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa_db SET nama = " + mhs.getNama()+ " WHERE id = "+mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete (int id) throws SQLException {
        String query = "DELETE FROM mahasiswa_db WHERE id = " +id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa getById (int id) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa_db WHERE id = "+id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }
    
    public List<Mahasiswa> getAll () throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa_db";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhsList;
    }
    
    public void indexReset() throws SQLException{
        String query = "ALTER TABLE mahasiswa_db AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil reset index");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) FROM mahasiswa_db";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void closeConnection() {
        if (koneksi != null){
            try{
                koneksi.close();
                System.out.println("Koneksi ditutup");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
} 