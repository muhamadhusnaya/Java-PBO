package SimulasiUTSPraktikum;

public class Orang {
    private String nama;
    private String alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }

    public Orang(){}

    //Overload
    public void Orang(String namaBaru, String alamatBaru){
        setNama(namaBaru);
        setAlamat(alamatBaru);
    }

    public void cetak(){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
