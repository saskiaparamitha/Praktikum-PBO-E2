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
    
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return wadah[indeks];
        }
        return null;
    }
    
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
            System.out.println("Berhasil mengubah elemen indeks " + indeks);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int ukuran) {
        if (ukuran >= 0 && ukuran <= kapasitas) {
            nbelm = ukuran;
        }
    }
    
    public void add(T elemen) {
        if (nbelm < kapasitas) {
            wadah[nbelm] = elemen;
            nbelm++;
            System.out.println("Berhasil menambahkan: " + elemen);
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }
    
    public boolean delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            // Geser elemen-elemen setelah indeks ke kiri
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            nbelm--;
            wadah[nbelm] = null; // bersihkan referensi
            System.out.println("Berhasil menghapus elemen indeks " + indeks);
            return true;
        }
        System.out.println("Indeks tidak valid!");
        return false;
    }
    
    public void showAll() {
        System.out.println("\n=== ISI KOLEKSI ===");
        System.out.println("Jumlah elemen: " + nbelm);
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Indeks " + i + ": " + wadah[i]);
        }
        System.out.println("===================");
    }
}
