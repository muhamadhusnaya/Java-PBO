package Praktikum13;

// Kelas model untuk menyimpan data obat
public class Obat {
    private String kodeObat;
    private String namaObat;
    private double hargaObat;

    // Konstruktor untuk membuat objek Obat baru
    public Obat(String kodeObat, String namaObat, double hargaObat) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
    }

    // Getter untuk kode obat
    public String getKodeObat() {
        return kodeObat;
    }

    // Getter untuk nama obat
    public String getNamaObat() {
        return namaObat;
    }

    // Getter untuk harga obat
    public double getHargaObat() {
        return hargaObat;
    }
}
