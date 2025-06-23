/* Nama File : Overloading.java
 * Deskripsi : Berisi atribut dan method dalam class 
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
 */

public class Overloading {
    
    int tambah (int x, int y){
        return x + y;
    }

    int tambah (int x, int y, int z){
        return x + y + z;
    }

    int tambah (int x){
        return x + x;
    }

    double tambah (double x, double y){
        return x + y;
    }

    double tambah (int y, double x){
        return y + x;
    }

    public static void main(String[] args) {
        Overloading O = new Overloading();
        System.out.println(O.tambah(1));
        System.out.println(O.tambah(1, 2));
        System.out.println(O.tambah(1, 2, 3));
        System.out.println(O.tambah(1, 2));
        System.out.println(O.tambah(1, 1.0));
    }
}
