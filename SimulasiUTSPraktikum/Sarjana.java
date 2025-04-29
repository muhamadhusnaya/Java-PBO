package SimulasiUTSPraktikum;

public class Sarjana extends Murid {
    private double ipk;

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public Sarjana() {}

    public Sarjana(String nama, String alamat, int noInduk, double ipk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setIpk(ipk);
    }

    public void reset(String nama, String alamat, int noInduk, double ipk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setIpk(ipk);
    }

    public String predikat(double ipk) {
        String predikat;
        if(ipk >= 2.0 && ipk <= 2.75) {
            predikat = "Memuaskan";
        } else if(ipk >= 2.76 && ipk <= 3.5) {
            predikat = "Sangat Memuaskan";
        } else if(ipk >= 3.51 && ipk <= 4.0) {
            predikat = "Dengan Pujian";
        } else {
            predikat = "-";
        }

        return predikat;
    }

    public void cetak() {
        super.cetak();
        System.out.println("IPK         : " + ipk);
        System.out.println("Predikat    : " + predikat(ipk));
    }
}
