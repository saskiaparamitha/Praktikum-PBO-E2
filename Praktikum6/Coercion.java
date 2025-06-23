/* Nama File : Coercion.java
 * Deskripsi : Berisi atribut dan method dalam class 
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
 */

public class Coercion {
    public static void main(String[] args) {
        //Program nomor 1
        int output1 = 'a';
        System.out.println(output1);

        /* Output : 97 (Berhasil)
         * Penjelasan : Dari Ascii Code a itu 97
         * a dikonversi oleh kompiler secara implisitm
         */

        //Program nomor 2
        // double x = 15.5;
        // int output2 = (int) x;
        // System.out.println(output2);

        /* Output : Gagal (Error)
         * Penjelasan : Mengkonversi double ke integer,
         * menghilangkan nilai dibelakang koma
         * harus menggunakan casting untuk memaksa
         */

        //Program nomor 3
        int y = 25;
        double output3 = y;
        System.out.println(output3);

        /* Output : 25.0 (Berhasil)
         * Penjelasan : Coercion, dikonversi oleh kompiler
         * ke tipe data double 
         */

        //Program nomor 4
        // int z = 78;
        // char output4 = (char) z;
        // System.out.println(output4);

        /* Output : N (Berhasil)
         * Penjelasan : Casting, mengubah 78 ke character code 
         * Ascii
         */

        //Program nomor 5
        char a = 'a';
        double output5 = a;
        System.out.println(output5);

        /* Output : 97.0 (Berhasil)
         * Penjelasan : Coercion, a dikonversi oleh kompiler ke 
         * kode Ascii dan menjadi double hasilnya 97.0
         */
    }
}
