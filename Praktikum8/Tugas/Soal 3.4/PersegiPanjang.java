class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
}
