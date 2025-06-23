/* Nama File : MGaris.java
 * Deskripsi : Main class untuk menggunakan class Garis
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 23 Feb 2025
 */

package TugasPrak4;

public class Dosen extends Pegawai {
    protected String jenisDosen;

    public Dosen(String NIP, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok, String jenisDosen) {
        super(NIP, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.jenisDosen = jenisDosen;
    }
}