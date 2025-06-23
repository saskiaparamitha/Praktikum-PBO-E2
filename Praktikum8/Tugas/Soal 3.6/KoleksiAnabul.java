class KoleksiAnabul extends Koleksi<Anabul> {
    public KoleksiAnabul(int kapasitas) {
        super(kapasitas);
    }
    
    @Override
    public void showAll() {
        System.out.println("\n=== KOLEKSI ANABUL ===");
        System.out.println("Jumlah anabul: " + getSize());
        for (int i = 0; i < getSize(); i++) {
            System.out.print((i + 1) + ". ");
            getIsi(i).tampilkanInfo();
        }
        System.out.println("======================");
    }
    
    public void bunyiSemuaAnabul() {
        System.out.println("\n=== BUNYI SEMUA ANABUL ===");
        for (int i = 0; i < getSize(); i++) {
            Anabul anabul = getIsi(i);
            System.out.println(anabul.getNama() + " bersuara: " + anabul.bersuara());
        }
    }
    
    public void gerakanSemuaAnabul() {
        System.out.println("\n=== GERAKAN SEMUA ANABUL ===");
        for (int i = 0; i < getSize(); i++) {
            Anabul anabul = getIsi(i);
            System.out.println(anabul.getNama() + " bergerak: " + anabul.bergerak());
        }
    }
}
