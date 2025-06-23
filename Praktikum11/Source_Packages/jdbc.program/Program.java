/*
 * Nama File : Program.java
 * Deskripsi : Untuk menjalankan program
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 22 Mei 2025
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

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
public class Program {
    
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main (String[] args) throws SQLException {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        //insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Kiya");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        //update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Saski");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        //insert
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() throws SQLException{
        System.out.println("===DisplayAll===");
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()){
            System.out.println("Tabel kosong");
        }
        else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        }
    }
}