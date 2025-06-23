public class Burung extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Burung: Cuit-cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println("Burung terbang di udara.");
    }

    @Override
    public String toString() {
        return "Burung";
    }
}
