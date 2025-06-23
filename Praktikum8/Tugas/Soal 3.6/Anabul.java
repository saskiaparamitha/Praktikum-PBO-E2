abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract String bersuara();
    public abstract String bergerak();
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Suara: " + bersuara() + ", Gerakan: " + bergerak());
    }
}
