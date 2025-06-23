public class Anjing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Anjing: Guk-guk!");
    }

    @Override
    public void bergerak() {
        System.out.println("Anjing melata mengejar bola.");
    }

    @Override
    public String toString() {
        return "Anjing";
    }
}
