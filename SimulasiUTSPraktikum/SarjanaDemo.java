package SimulasiUTSPraktikum;

public class SarjanaDemo {
    public static void main(String[] args) {
        Sarjana sarjana = new Sarjana();
        sarjana.setNama("Budi");
        sarjana.setAlamat("Jakarta");
        sarjana.setNoInduk(12345);
        sarjana.setIpk(3.8);

        System.out.println("Data Sarjana:");
        sarjana.cetak();
        sarjana.predikat(sarjana.getIpk());
    }
}
