class Koleksi<T> {
    private int nbelm; // banyaknya elemen efektif
    private T[] wadah; // nilai-nilai elemen dalam koleksi
    private int kapasitas;
    
    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        this.kapasitas = kapasitas;
        this.wadah = (T[]) new Object[kapasitas];
        this.nbelm = 0;
    }
    
    // Fungsi getIsi - mendapatkan elemen pada indeks tertentu
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return wadah[indeks];
        }
        System.out.println("Indeks " + indeks + " tidak valid! (Range: 0-" + (nbelm-1) + ")");
        return null;
    }
    
    // Prosedur setIsi - mengubah elemen pada indeks tertentu (Edit/Update)
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            T nilaiLama = wadah[indeks];
            wadah[indeks] = nilai;
            System.out.println("Berhasil mengubah elemen indeks " + indeks + 
                             " dari '" + nilaiLama + "' menjadi '" + nilai + "'");
        } else {
            System.out.println("Indeks " + indeks + " tidak valid untuk update!");
        }
    }
    
    // Fungsi getSize - mendapatkan jumlah elemen efektif
    public int getSize() {
        return nbelm;
    }
    
    // Prosedur setSize - mengatur jumlah elemen efektif
    public void setSize(int ukuran) {
        if (ukuran >= 0 && ukuran <= kapasitas) {
            if (ukuran < nbelm) {
                // Jika ukuran diperkecil, bersihkan elemen yang tidak terpakai
                for (int i = ukuran; i < nbelm; i++) {
                    wadah[i] = null;
                }
            }
            nbelm = ukuran;
            System.out.println("Size koleksi diubah menjadi: " + nbelm);
        } else {
            System.out.println("Ukuran tidak valid! Harus antara 0-" + kapasitas);
        }
    }
    
    // Prosedur add - menambahkan elemen baru
    public void add(T elemen) {
        if (nbelm < kapasitas) {
            wadah[nbelm] = elemen;
            nbelm++;
            System.out.println("Berhasil menambahkan: '" + elemen + "' di indeks " + (nbelm-1));
        } else {
            System.out.println("Koleksi sudah penuh! Kapasitas maksimal: " + kapasitas);
        }
    }
    
    // Metode delete - menghapus elemen pada indeks tertentu
    public boolean delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            T elemenDihapus = wadah[indeks];
            
            // Geser elemen-elemen setelah indeks ke kiri
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            nbelm--;
            wadah[nbelm] = null; // bersihkan referensi
            
            System.out.println("✓ Berhasil menghapus elemen '" + elemenDihapus + 
                             "' dari indeks " + indeks);
            return true;
        }
        System.out.println("Indeks " + indeks + " tidak valid untuk penghapusan!");
        return false;
    }
    
    // Prosedur showAll - menampilkan semua elemen koleksi
    public void showAll() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           ISI KOLEKSI");
        System.out.println("=".repeat(40));
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Jumlah elemen efektif: " + nbelm);
        System.out.println("-".repeat(40));
        
        if (nbelm == 0) {
            System.out.println("Koleksi kosong.");
        } else {
            for (int i = 0; i < nbelm; i++) {
                System.out.printf("Indeks [%d]: %s\n", i, wadah[i]);
            }
        }
        System.out.println("=".repeat(40));
    }
    
    // Method tambahan untuk mencari elemen
    public int cari(T elemen) {
        for (int i = 0; i < nbelm; i++) {
            if (wadah[i] != null && wadah[i].equals(elemen)) {
                return i;
            }
        }
        return -1; // tidak ditemukan
    }
    
    // Method untuk mengecek apakah koleksi kosong
    public boolean isEmpty() {
        return nbelm == 0;
    }
    
    // Method untuk mengecek apakah koleksi penuh
    public boolean isFull() {
        return nbelm == kapasitas;
    }
    
    // Method untuk mendapatkan kapasitas
    public int getKapasitas() {
        return kapasitas;
    }
}
