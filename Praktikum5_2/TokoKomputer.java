package Praktikum5_2;

public class TokoKomputer {
    private String merk;
    private double harga;
    private int ram;
    private String prosesor;
    private String vga;
    private double ukuranLayar;

    // Setter dan Getter
    public void setMerk(String merk) { this.merk = merk; }
    public String getMerk() { return merk; }

    public void setHarga(double harga) { this.harga = harga; }
    public double getHarga() { return harga; }

    public void setRam(int ram) { this.ram = ram; }
    public int getRam() { return ram; }

    public void setProsesor(String prosesor) { this.prosesor = prosesor; }
    public String getProsesor() { return prosesor; }

    public void setVga(String vga) { this.vga = vga; }
    public String getVga() { return vga; }

    public void setUkuranLayar(double ukuranLayar) { this.ukuranLayar = ukuranLayar; }
    public double getUkuranLayar() { return ukuranLayar; }

    // Method menampilkan info produk
    public void infoProduk() {
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Prosesor: " + prosesor);
        System.out.println("VGA: " + vga);
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }

    // Overloading: ubah VGA lalu tampilkan info
    public void infoProduk(String vgaBaru) {
        setVga(vgaBaru);
        infoProduk();
    }
}
