/* Nama File : BangunDatarGenericTest.java
 * Deskripsi : Main class untuk generic BangunDatar
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 01 Mei 2025
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg;
            new BangunDatarGeneric<Lingkaran>();
    bdg.set();
    System.out.println("Keliling lingkaran : "
        +bdg.hitungKeliling());
    System.out.println("Tipe generic : "
        +bdg.get().getClass().getName());
    }
} 
