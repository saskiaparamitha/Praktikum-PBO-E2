/* Nama File : Vehicle.java
 * Deskripsi : Kelas representasi Vehicle
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }

    public static void hitungSewa(Vehicle v){
        v.calRent(100, 5000);
    }
}
