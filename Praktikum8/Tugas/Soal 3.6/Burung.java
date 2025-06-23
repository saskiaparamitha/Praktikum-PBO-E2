class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public String bersuara() {
        return "Cuit";
    }
    
    @Override
    public String bergerak() {
        return "Terbang";
    }
}
