package SimulasiUTSPraktikum;

public class Sarjana extends Murid {
    private double ipk;

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void Sarjana(){}

    public void Sarjana(String nama, String alamat, int noInduk, double ipk) {
        super.Murid(nama, alamat, noInduk);
        setIpk(ipk);
    }

    public void reset(String nama, String alamat, int noInduk, double ipk) {
        super.Murid(nama, alamat, noInduk);
        setIpk(ipk);
    }

    public void predikat(double ipk){
        if (ipk >= 3.5) {
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (ipk >= 3.0) {
            System.out.println("Predikat: Memuaskan");
        } else if (ipk >= 2.5) {
            System.out.println("Predikat: Cukup");
        } else if (ipk >= 2.0) {
            System.out.println("Predikat: Kurang");
        } else {
            System.out.println("Predikat: Sangat Kurang");
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("IPK: " + ipk);
    }
}
