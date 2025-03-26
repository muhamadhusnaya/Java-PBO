package Latihan1;
import java.util.Scanner;

class Penjualan {
    private String kode, nama;
    private float harga;
    private int jumlah;
    
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public float getTotalPembelian() {
        return harga * jumlah;
    }
    
    public String getBonus() {
        float total = getTotalPembelian();
        String bonus = "Tidak ada bonus";
        
        if (total >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (total >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (total >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        }
        return bonus;
    }
    
    public void cetakNota() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Satuan : " + harga);
        System.out.println("Jumlah Beli  : " + jumlah);
        System.out.println("Total Harga  : " + getTotalPembelian());
        
        String bonus = getBonus();
        
        switch (bonus) {
            case "Setrika":
                System.out.println("Bonus        : Setrika");
                break;
            case "Payung":
                System.out.println("Bonus        : Payung");
                break;
            case "Ballpoint":
                System.out.println("Bonus        : Ballpoint");
                break;
            default:
                System.out.println("Bonus        : Tidak ada bonus");
        }
    }
}

public class PenjualanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();
        
        System.out.print("Masukkan kode barang: ");
        String kode = scanner.nextLine();
        
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan harga barang: ");
        float harga = scanner.nextFloat();
        
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();
        
        penjualan.setData(kode, nama, harga, jumlah);
        System.out.println("\n--- Nota Pembelian ---");
        penjualan.cetakNota();
        
        scanner.close();
    }
}