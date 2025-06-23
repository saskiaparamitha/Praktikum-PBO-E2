public class ContohMetodeGenerik {

    // Metode generik: menerima dan mencetak isi dari Datum
    public static <T> void prosesDatum(Datum<T> datum) {
        System.out.println("Memproses datum dengan isi bertipe: " + datum.getIsi().getClass().getSimpleName());
        datum.tampilkan();
        if (datum.getIsi() instanceof Anabul a) {
            a.bersuara();
            a.bergerak();
        }
        System.out.println();
    }
}
