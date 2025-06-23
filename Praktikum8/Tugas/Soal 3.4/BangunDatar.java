abstract class BangunDatar {
    protected String nama;
    
    public BangunDatar(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    public void tampilkanInfo() {
        System.out.println("Bangun: " + nama);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("------------------------");
    }
}
