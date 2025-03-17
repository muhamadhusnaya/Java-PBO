package Latihan1Praktikum2;

public class Mobil {
    private String merek;
    private String model;
    private String warna;
    private String platNomor;
    private int tahunProduksi;    

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void hidupkanMobil() {
        System.out.println("Mobil dinyalakan, ngeeng ngeeng!");
    }

    public void matikanMobil() {
        System.out.println("Mobil dimatikan, nguuut!");
    }

    public void ubahGigi(int gigi) {
        System.out.println("Gigi mobil diubah ke " + gigi + ", brumm!");
    }
}
