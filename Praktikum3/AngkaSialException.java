/* Nama File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 06 Mar 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial!!!");
    }
}

