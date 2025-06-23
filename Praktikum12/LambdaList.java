/* Nama file    : LambdaList.java
 * Deskripsi    : Implementasi lambda pada list, digunakan sebagai parameter pada method
 * Pembuat      : Saskia Putri Paramitha
 * Tanggal      : Kamis, 5 Juni 2025
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Paramitha");
        mahasiswaList.add("Svetlana");
        mahasiswaList.add("Tatjana");
        mahasiswaList.add("Bintang");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
