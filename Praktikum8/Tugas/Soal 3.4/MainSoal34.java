public class MainSoal34 {
    public static void main(String[] args) {
        // Membuat koleksi bangun datar dengan kapasitas 10
        BangunDatarGenerik<BangunDatar> koleksiBangun = new BangunDatarGenerik<>(10);
        
        System.out.println("\n Membuat objek-objek bangun datar");
        
        // Membuat berbagai objek bangun datar
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(7.5);
        
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(8, 6);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(12, 4);
        
        Segitiga segitiga1 = new Segitiga(6, 4, 5, 6, 7);
        Segitiga segitiga2 = new Segitiga(8, 6, 6, 8, 10);
        
        System.out.println("\n Menambahkan bangun datar ke koleksi");
        
        // Menambahkan ke koleksi
        koleksiBangun.tambahBangun(persegi1);
        koleksiBangun.tambahBangun(persegiPanjang1);
        koleksiBangun.tambahBangun(segitiga1);
        koleksiBangun.tambahBangun(persegi2);
        koleksiBangun.tambahBangun(persegiPanjang2);
        koleksiBangun.tambahBangun(segitiga2);
        
        // Menampilkan semua bangun
        koleksiBangun.tampilkanSemuaBangun();
        
        // Menampilkan statistik
        System.out.println("Jumlah bangun datar: " + koleksiBangun.getJumlahBangun());
        System.out.printf("Total luas semua bangun: %.2f\n", koleksiBangun.totalLuas());
        System.out.printf("Total keliling semua bangun: %.2f\n", koleksiBangun.totalKeliling());
        System.out.printf("Rata-rata luas: %.2f\n", 
            koleksiBangun.totalLuas() / koleksiBangun.getJumlahBangun());
        System.out.printf("Rata-rata keliling: %.2f\n", 
            koleksiBangun.totalKeliling() / koleksiBangun.getJumlahBangun());
        
        // Test mencari bangun dengan luas terbesar
        System.out.println("\n Mencari bangun dengan luas terbesar");
        BangunDatar bangunTerbesar = null;
        double luasTerbesar = 0;
        
        for (int i = 0; i < koleksiBangun.getJumlahBangun(); i++) {
            BangunDatar bangun = koleksiBangun.getBangun(i);
            if (bangun.hitungLuas() > luasTerbesar) {
                luasTerbesar = bangun.hitungLuas();
                bangunTerbesar = bangun;
            }
        }
        
        if (bangunTerbesar != null) {
            System.out.println("Bangun dengan luas terbesar:");
            bangunTerbesar.tampilkanInfo();
        }
        
        // Test polymorphism
        System.out.println("\n Demonstrasi Polymorphism");
        System.out.println("Semua objek diperlakukan sebagai BangunDatar:");
        for (int i = 0; i < koleksiBangun.getJumlahBangun(); i++) {
            BangunDatar bangun = koleksiBangun.getBangun(i);
            System.out.printf("%d. %s - Luas: %.2f\n", 
                (i+1), bangun.getNama(), bangun.hitungLuas());
        }
    }
}
