/* Nama File : MainAnabul.java
 * Deskripsi : Berisi atribut dan method dalam class 
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
 */

 public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : peliharaan) {
            a.suara();
            a.gerak();
            System.out.println();
        }
    }
}
