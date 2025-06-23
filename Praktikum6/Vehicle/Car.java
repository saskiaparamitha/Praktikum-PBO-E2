/* Nama File : Car.java
 * Deskripsi : Kelas representasi Car
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare-100.00f;
        System.out.println("Harga sewa mobil =" +fare);
    }
}
