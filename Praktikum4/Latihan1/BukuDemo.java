class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void cetakBuku() {
        System.out.println(judul + ", " + pengarang + ", " + penerbit + ", " + tahun);
    }
}

public class BukuDemo {
    public static void main(String[] args) {
        Buku bukuPBOJava = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku bukuDasproJava = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);

        // Menampilkan informasi buku
        System.out.println("\nJudul Buku yaitu : "); bukuPBOJava.cetakBuku();
        System.out.println("\nJudul Buku yaitu :  "); bukuDasproJava.cetakBuku();
    }
}
