import java.util.Scanner;

public class Ramadhan {
    private String nama;
    private int usia;
    private String target;


    public void setRamadhan(String nama, int usia, String target) {
        this.nama = nama;
        this.usia = usia;
        this.target = target;
    }

    public void getRamadhan() {
        System.out.println("\nInformasi Ramadhan:");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Target: " + target);
    }

    public void sahur() {
        System.out.println(nama + " sahur pukul 3.30.");
    }

    public void berbuka() {
        System.out.println(nama + " berbuka pukul 18.05 dengan yang manis-manis :)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ramadhan[] ramadhanList = new Ramadhan[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data untuk objek ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Masukkan target: ");
            String target = scanner.nextLine();

            ramadhanList[i] = new Ramadhan();
            ramadhanList[i].setRamadhan(nama, usia, target);
        }

        System.out.println("\nInformasi dari 3 objek Ramadhan:");
        for (int i = 0; i < 3; i++) {
            ramadhanList[i].getRamadhan();
            ramadhanList[i].sahur();
            ramadhanList[i].berbuka();
            System.out.println(); 
        }

        scanner.close();
    }
}