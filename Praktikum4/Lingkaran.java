/* Nama File : MGaris.java
 * Deskripsi : Main class untuk menggunakan class Garis
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 23 Feb 2025
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter/2;
        // setBorder(border);
        // setWarna(warna);
        // setJmlSisi(1);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari : " + jari);
    }
}
