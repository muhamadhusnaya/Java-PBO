package Praktikum5_2;

public class Laptop extends TokoKomputer {
    public Laptop(String merk, double harga, int ram, String prosesor, String vga, double ukuranLayar) {
        setMerk(merk);
        setHarga(harga);
        setRam(ram);
        setProsesor(prosesor);
        setVga(vga);
        setUkuranLayar(ukuranLayar);
    }

    public void infoProduk() {
        System.out.println("=== Info Laptop ===");
        super.infoProduk();
    }
}
