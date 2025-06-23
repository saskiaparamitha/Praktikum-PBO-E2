class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public String bersuara() {
        return "Guk-guk";
    }
    
    @Override
    public String bergerak() {
        return "Melata";
    }
}
