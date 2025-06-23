/* Nama File : BangunDatarGeneric.java
 * Deskripsi : Main class untuk generic BangunDatar
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 01 Mei 2025
 */

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public void set (T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
