/* Nama File : ArrayListTest.java
 * Deskripsi : Program pengunaaan objek ArrayList sebagai Collection class
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 08 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        // berissi objek string
        ArrayList<String> strings = new ArrayList<String> ();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.println(s + " ");
        }
    }
}