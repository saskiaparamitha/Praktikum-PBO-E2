/* Nama file :
 */

public class BangunDatar {
// public final class BangunDatar {
// final berarti tidak mewariskan
    // private int jmlSisi;
    // private String warna;
    // private String border;
    // private static int counterBangunDatar = 0;
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    // protected bisa diakses di class dan package yang sama

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar : " + counterBangunDatar);
    }
    //static tidak bisa di-Override 
    //yang bisa melakukan Override hanya subclass
}