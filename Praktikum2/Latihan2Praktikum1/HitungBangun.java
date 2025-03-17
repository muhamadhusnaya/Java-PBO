package Latihan2Praktikum1;
import java.util.Scanner;

public class HitungBangun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Pilih bangun yang ingin dihitung:");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                System.out.println("Pilih perhitungan:");
                System.out.println("1. Luas Segitiga");
                System.out.println("2. Keliling Segitiga");
                System.out.print("Masukkan pilihan: ");
                int subPilihan = scanner.nextInt();
                
                if (subPilihan == 1) {
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    double luas = (alas * tinggi) / 2;
                    System.out.println("Luas segitiga: " + luas);
                } else if (subPilihan == 2) {
                    System.out.print("Masukkan sisi pertama: ");
                    double sisi1 = scanner.nextDouble();
                    System.out.print("Masukkan sisi kedua: ");
                    double sisi2 = scanner.nextDouble();
                    System.out.print("Masukkan sisi ketiga: ");
                    double sisi3 = scanner.nextDouble();
                    double keliling = sisi1 + sisi2 + sisi3;
                    System.out.println("Keliling segitiga: " + keliling);
                }
            } else if (pilihan == 2) {
                System.out.println("Pilih perhitungan:");
                System.out.println("1. Luas Lingkaran");
                System.out.println("2. Keliling Lingkaran");
                System.out.print("Masukkan pilihan: ");
                int subPilihan = scanner.nextInt();
                
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                
                if (subPilihan == 1) {
                    double luas = Math.PI * jariJari * jariJari;
                    System.out.println("Luas lingkaran: " + luas);
                } else if (subPilihan == 2) {
                    double keliling = 2 * Math.PI * jariJari;
                    System.out.println("Keliling lingkaran: " + keliling);
                }
            } else if (pilihan == 3) {
                System.out.println("Pilih perhitungan:");
                System.out.println("1. Luas Permukaan Kubus");
                System.out.println("2. Volume Kubus");
                System.out.print("Masukkan pilihan: ");
                int subPilihan = scanner.nextInt();
                
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();
                
                if (subPilihan == 1) {
                    double luasPermukaan = 6 * Math.pow(sisi, 2);
                    System.out.println("Luas permukaan kubus: " + luasPermukaan);
                } else if (subPilihan == 2) {
                    double volume = Math.pow(sisi, 3);
                    System.out.println("Volume kubus: " + volume);
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Sampai Jumpaa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}