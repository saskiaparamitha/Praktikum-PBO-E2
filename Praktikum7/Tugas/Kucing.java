public class Kucing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Kucing: Meong~");
    }

    @Override
    public void bergerak() {
        System.out.println("Kucing melata di lantai.");
    }

    @Override
    public String toString() {
        return "Kucing";
    }
}
