/* Nama File : Pegawai.java
 * Deskripsi : Kelas representasi Pegawai
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    //Method
    //Setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " +gajiPokok);
    }
}