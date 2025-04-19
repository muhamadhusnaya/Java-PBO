package Praktikum6;
import java.util.Scanner;

public class PerulanganFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan Faktorial: ");
        int angka = input.nextInt();
        
        System.out.println("Bilangan : " + angka);
        int hasil = 1;

        for (int i = 2; i <= angka; i++) {
            System.out.println(hasil + " x " + i + " = " + (hasil * i));
            hasil *= i;
        }
    }
}
