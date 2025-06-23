/* Nama File : MGaris.java
 * Deskripsi : Main class untuk menggunakan class Garis
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 23 Feb 2025
 */

package TugasPrak4;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected String tanggalLahir;
    protected String tmtBekerja;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmtBekerja = tmtBekerja;
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmtBekerja);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}