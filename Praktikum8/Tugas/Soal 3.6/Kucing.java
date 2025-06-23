class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public String bersuara() {
        return "Meong";
    }
    
    @Override
    public String bergerak() {
        return "Melata";
    }
}
