/* Nama File : MKoleksi.java
 * Deskripsi : Main class untuk koleksi ...
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 08 Mei 2025
 */

public class MKoleksi {
    public static void main(String[] args){
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        for (char c = 'A'; c <= "J"; c++){
            koleksiKarakter.add(c);
        }

        System.out.println("Koleksi Karakter");
        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(1, 'Z');
        System.out.println("Koleksi karakter setelah dilakukan setIsi");
        koleksiKarakter.showAll();

        Character hapus = koleksiKarakter.delete();
        System.out.println("Koleksi karakter setelah dilakukan delete");
        koleksiKarakter.showAll();
        System.out.println("Elemen yang terhapus : " + hapus);
        System.out.println("Elemen koleksi saat ini : " + koleksiKarakter.getIsi());

    }
}