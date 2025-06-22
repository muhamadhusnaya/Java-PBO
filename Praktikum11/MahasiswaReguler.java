package Praktikum11;

public class MahasiswaReguler extends Mahasiswa implements Penilaian {
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public MahasiswaReguler(String nim, String nama, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        super(nim, nama);
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.2 )+ (nilaiUTS * 0.35) + (nilaiUAS * 0.45);
    }

    @Override
    public void tampilkanData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
    
}
