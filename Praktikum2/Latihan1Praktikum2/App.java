package Latihan1Praktikum2;

public class App {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();

        mobilku.setMerek("Toyota");
        mobilku.setModel("Avanza");
        mobilku.setWarna("Putih");
        mobilku.setPlatNomor("B 1234 XYZ");
        mobilku.setTahunProduksi(2019);

        mobilmu.setMerek("Honda");
        mobilmu.setModel("Jazz");
        mobilmu.setWarna("Hitam");
        mobilmu.setPlatNomor("B 4321 XYZ");
        mobilmu.setTahunProduksi(2018);

        System.out.println("Mobilku:");
        System.out.println("Merek: " + mobilku.getMerek());
        System.out.println("Model: " + mobilku.getModel());
        System.out.println("Warna: " + mobilku.getWarna());
        System.out.println("Plat Nomor: " + mobilku.getPlatNomor());
        System.out.println("Tahun Produksi: " + mobilku.getTahunProduksi());
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(1);
        mobilku.matikanMobil();

        System.out.println("\nMobilmu:");
        System.out.println("Merek: " + mobilmu.getMerek());
        System.out.println("Model: " + mobilmu.getModel());
        System.out.println("Warna: " + mobilmu.getWarna());
        System.out.println("Plat Nomor: " + mobilmu.getPlatNomor());
        System.out.println("Tahun Produksi: " + mobilmu.getTahunProduksi());
        mobilmu.hidupkanMobil();
        mobilmu.ubahGigi(2);
        mobilmu.matikanMobil();
    }
}
