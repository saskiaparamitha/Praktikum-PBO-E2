/* Nama File : Manager.java
 * Deskripsi : Kelas representasi Manager
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Manager extends Pegawai{
    private int tunjangan = 700000;

    //Method
    //Konstruktor
    public Manager(String nama){
        setNama(nama);
    }

    //Tampil Data
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
