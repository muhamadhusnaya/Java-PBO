package Praktikum6;

import java.util.Scanner;

public class PerulanganBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        System.out.println("Bilangan : " + n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n=================================");
        System.out.println("Dipecah : 3");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            if (i % 3 == 0) {
                System.out.println();
            }
        }

        if (n % 3 != 0) {
            System.out.println();
        }
    }
}
