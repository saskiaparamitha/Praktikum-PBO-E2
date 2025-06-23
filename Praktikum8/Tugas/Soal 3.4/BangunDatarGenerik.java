class BangunDatarGenerik<T extends BangunDatar> {
    private T[] kumpulanBangun;
    private int jumlahBangun;
    private int kapasitas;
    
    @SuppressWarnings("unchecked")
    public BangunDatarGenerik(int kapasitas) {
        this.kapasitas = kapasitas;
        this.kumpulanBangun = (T[]) new BangunDatar[kapasitas];
        this.jumlahBangun = 0;
    }
    
    public void tambahBangun(T bangun) {
        if (jumlahBangun < kapasitas) {
            kumpulanBangun[jumlahBangun] = bangun;
            jumlahBangun++;
            System.out.println("Berhasil menambahkan " + bangun.getNama());
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }
    
    public void tampilkanSemuaBangun() {
        System.out.println("\n=== DAFTAR BANGUN DATAR ===");
        for (int i = 0; i < jumlahBangun; i++) {
            System.out.println((i + 1) + ". ");
            kumpulanBangun[i].tampilkanInfo();
        }
    }
    
    public double totalLuas() {
        double total = 0;
        for (int i = 0; i < jumlahBangun; i++) {
            total += kumpulanBangun[i].hitungLuas();
        }
        return total;
    }
    
    public double totalKeliling() {
        double total = 0;
        for (int i = 0; i < jumlahBangun; i++) {
            total += kumpulanBangun[i].hitungKeliling();
        }
        return total;
    }

    public int getJumlahBangun() {
        return jumlahBangun;
    }
    
    public T getBangun(int indeks) {
        if (indeks >= 0 && indeks < jumlahBangun) {
            return kumpulanBangun[indeks];
        }
        return null;
    }
}
