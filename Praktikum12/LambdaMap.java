/* Nama file    : LambdaMap.java
 * Deskripsi    : Implementasi lambda untuk sebuah program, digunakan untuk 
 *                menampilkan key (NIM) dan value (nama) dari sebuah Map
 * Pembuat      : Saskia Putri Paramitha
 * Tanggal      : Kamis, 5 Juni 2025
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan Nama Mahasiswa sebagai value
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060123140144", "Saskia Putri Paramitha");
        mahasiswa.put("24060123140133", "Budi Santoso");
        mahasiswa.put("24060123140155", "Ani Lestari");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswa.forEach((key, value) -> System.out.println("NIM : " + key + ", Nama : " + value)
        );
    }
}
