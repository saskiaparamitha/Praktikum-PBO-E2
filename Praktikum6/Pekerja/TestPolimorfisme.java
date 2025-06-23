/* Nama File : TestPolimorfisme.java
 * Deskripsi : Kelas main demo untuk Pegawai dan anak-anaknya
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");
        Programmer pegawai4 = new Programmer("Rahmat");
        Programmer pegawai5 = new Programmer("Zikry");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}

/* Manfaat */
/* */