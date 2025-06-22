package Praktikum12;

public class Obat {
    private String kodeObat;
    private String namaObat;
    private double hargaObat;

    public Obat(String kodeObat, String namaObat, double hargaObat) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public double getHargaObat() {
        return hargaObat;
    }
}
