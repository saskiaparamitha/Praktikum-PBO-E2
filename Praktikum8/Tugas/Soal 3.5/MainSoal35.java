public class MainSoal35 {
    public static void main(String[] args) {
        // TEST 1: KOLEKSI CHARACTER (10 ELEMEN)
        System.out.println("\n TEST 1: KOLEKSI CHARACTER");
        System.out.println("Membuat koleksi karakter dengan kapasitas 10...");
        
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        
        // Menambahkan 10 karakter
        System.out.println("\n Menambahkan 10 karakter:");
        char[] karakter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (char c : karakter) {
            koleksiKarakter.add(c);
        }
        
        // Menampilkan semua elemen
        koleksiKarakter.showAll();
        
        // Test operasi getIsi
        System.out.println("\n Test operasi getIsi:");
        System.out.println("Elemen indeks 3: " + koleksiKarakter.getIsi(3));
        System.out.println("Elemen indeks 7: " + koleksiKarakter.getIsi(7));
        System.out.println("Elemen indeks 15 (invalid): " + koleksiKarakter.getIsi(15));
        
        // Test operasi setIsi (Edit/Update)
        System.out.println("\n Test operasi setIsi (Edit/Update):");
        koleksiKarakter.setIsi(3, 'X');
        koleksiKarakter.setIsi(7, 'Y');
        koleksiKarakter.setIsi(15, 'Z'); // invalid index
        
        System.out.println("\nSetelah update:");
        koleksiKarakter.showAll();
        
        // Test operasi delete
        System.out.println("\n Test operasi delete:");
        koleksiKarakter.delete(5);
        koleksiKarakter.delete(0);
        koleksiKarakter.delete(20); // invalid index
        
        System.out.println("\nSetelah penghapusan:");
        koleksiKarakter.showAll();
        
        // Test operasi pencarian
        System.out.println("\n Test operasi pencarian:");
        int indeksX = koleksiKarakter.cari('X');
        int indeksZ = koleksiKarakter.cari('Z');
        System.out.println("Indeks karakter 'X': " + 
            (indeksX >= 0 ? indeksX : "Tidak ditemukan"));
        System.out.println("Indeks karakter 'Z': " + 
            (indeksZ >= 0 ? indeksZ : "Tidak ditemukan"));
        
        // TEST 2: KOLEKSI STRING
        System.out.println("\n\n TEST 2: KOLEKSI STRING");
        System.out.println("Membuat koleksi string dengan kapasitas 5...");
        
        Koleksi<String> koleksiString = new Koleksi<>(5);
        
        System.out.println("\n Menambahkan nama-nama:");
        String[] nama = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        for (String n : nama) {
            koleksiString.add(n);
        }
        
        koleksiString.showAll();
        
        // Test menambah elemen saat penuh
        System.out.println("\n Test menambah elemen saat koleksi penuh:");
        koleksiString.add("Frank");
        
        // Test setSize
        System.out.println("\n Test operasi setSize:");
        koleksiString.setSize(3); // perkecil ukuran
        koleksiString.showAll();
        
        koleksiString.setSize(4); // perbesar ukuran
        koleksiString.add("Grace");
        koleksiString.showAll();

        // TEST 3: KOLEKSI INTEGER
        System.out.println("\n\n TEST 3: KOLEKSI INTEGER");
        System.out.println("Membuat koleksi integer dengan kapasitas 7...");
        
        Koleksi<Integer> koleksiInteger = new Koleksi<>(7);
        
        System.out.println("\n Menambahkan angka-angka:");
        int[] angka = {10, 20, 30, 40, 50};
        for (int a : angka) {
            koleksiInteger.add(a);
        }
        
        koleksiInteger.showAll();
        
        // Test berbagai operasi
        System.out.println("\n Test berbagai operasi:");
        System.out.println("Koleksi kosong? " + koleksiInteger.isEmpty());
        System.out.println("Koleksi penuh? " + koleksiInteger.isFull());
        System.out.println("Ukuran saat ini: " + koleksiInteger.getSize());
        System.out.println("Kapasitas: " + koleksiInteger.getKapasitas());
        
        // Mengisi sampai penuh
        koleksiInteger.add(60);
        koleksiInteger.add(70);
        
        System.out.println("\nSetelah menambah 2 elemen lagi:");
        koleksiInteger.showAll();
        System.out.println("Koleksi penuh? " + koleksiInteger.isFull());
        
        // SUMMARY
        System.out.println("Semua fitur koleksi generik telah ditest:");
        System.out.println("getIsi() - mengambil elemen pada indeks tertentu");
        System.out.println("setIsi() - mengubah elemen (Edit/Update)");
        System.out.println("getSize() - mendapatkan jumlah elemen efektif");
        System.out.println("setSize() - mengatur jumlah elemen efektif");
        System.out.println("add() - menambahkan elemen baru");
        System.out.println("delete() - menghapus elemen pada indeks tertentu");
        System.out.println("showAll() - menampilkan semua elemen koleksi");
        System.out.println("Fitur tambahan: cari(), isEmpty(), isFull()");
        
        System.out.println("\nKoleksi berhasil bekerja dengan berbagai tipe data:");
        System.out.println("Character (10 elemen)");
        System.out.println("String (5 elemen)");
        System.out.println("Integer (7 elemen)");
    }
}
