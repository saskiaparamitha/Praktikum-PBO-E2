public class Main {
    public static void main(String[] args) {
        // Membuat Datum untuk masing-masing anabul
        Datum<Anabul> datumKucing = new Datum<>(new Kucing());
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing());
        Datum<Anabul> datumBurung = new Datum<>(new Burung());

        // Memproses semuanya menggunakan ContohMetodeGenerik
        ContohMetodeGenerik.prosesDatum(datumKucing);
        ContohMetodeGenerik.prosesDatum(datumAnjing);
        ContohMetodeGenerik.prosesDatum(datumBurung);
    }
}
