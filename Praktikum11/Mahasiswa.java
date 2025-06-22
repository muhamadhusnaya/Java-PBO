package Praktikum11;

public abstract class Mahasiswa {
    protected String nim;
    protected String nama;
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public abstract void tampilkanData();
}