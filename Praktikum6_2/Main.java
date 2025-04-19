class TokoLaptop {
    protected String merk;
    protected int jumlah;
    protected double harga;

    public TokoLaptop(String merk, int jumlah, double harga) {
        this.merk = merk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: Rp" + harga);
    }
}

class Asus extends TokoLaptop {
    private String series;

    public Asus(String series, int jumlah, double harga) {
        super("Asus", jumlah, harga);
        this.series = series;
    }

    public String klasifikasiHarga() {
        if (harga < 5000000) {
            return "Murah";
        } else if (harga <= 10000000) {
            return "Sedang";
        } else {
            return "Mahal";
        }
    }

    public double hitungTotalPenjualan() {
        return jumlah * harga;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Series: " + series);
        System.out.println("Klasifikasi Harga: " + klasifikasiHarga());
        System.out.println("Total Penjualan: Rp" + hitungTotalPenjualan());
        System.out.println("---------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Asus laptop1 = new Asus("ROG Strix", 5, 18500000);
        Asus laptop2 = new Asus("Vivobook 14", 8, 7500000);
        Asus laptop3 = new Asus("Zenbook Pro", 3, 12500000);

        laptop1.tampilkanInfo();
        laptop2.tampilkanInfo();
        laptop3.tampilkanInfo();
    }
}
