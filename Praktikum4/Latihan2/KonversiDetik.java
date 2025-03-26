package Latihan2;

import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah detik: ");
        int totalDetik = scanner.nextInt();
        
        int hari = totalDetik / 86400;
        int sisaDetik = totalDetik % 86400;
        
        int jam = sisaDetik / 3600;
        sisaDetik %= 3600;
        
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;
        
        System.out.println("Detik  : " + totalDetik);
        System.out.println("Hari   : " + hari);
        System.out.println("Jam    : " + jam);
        System.out.println("Menit  : " + menit);
        System.out.println("Detik  : " + detik);
        
        scanner.close();
    }
}