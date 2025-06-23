/* Nama File : Lingkaran.java
 * Deskripsi : Main class untuk generic BangunDatar
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 08 Mei 2025
 */

public class Lingkaran {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
