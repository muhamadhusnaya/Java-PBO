package SimulasiUTSPraktikum;

public class Murid extends Orang {
    private int noInduk;

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }
    public int getNoInduk() {
        return noInduk;
    }

    public Murid() {}

    public Murid(String nama, String alamat, int noInduk){
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
    }

    public void cetak() {
        super.cetak();
        System.out.println("No Induk: " + noInduk);
    }
}
