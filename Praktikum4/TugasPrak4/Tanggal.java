/* Nama File : MGaris.java
 * Deskripsi : Main class untuk menggunakan class Garis
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 23 Feb 2025
 */

package TugasPrak4;

public class Tanggal {
    private int hari, bulan, tahun;
    
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    @Override
    public String toString() {
        return hari + "-" + bulan + "-" + tahun;
    }
}