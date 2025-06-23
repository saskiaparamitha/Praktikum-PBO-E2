/* Nama File : Programmer.java
 * Deskripsi : Kelas representasi Programmer
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    //Method
    //Konstruktor
    public Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
