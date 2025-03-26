import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        while (true) {
            System.out.println("Pilih skala yang diinginkan:");
            System.out.println("1. Kelvin");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Rankine");
            System.out.println("4. Delisle");
            System.out.println("5. Newton");
            System.out.println("6. Réaumur");
            System.out.println("7. Rømer");
            System.out.print("Masukkan pilihan (1-7, 0 untuk keluar): ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            }
            
            double hasil = 0;
            String konversi = "";

            if (pilihan == 1) {
                hasil = celsius + 273.15;
                konversi = "Kelvin";
            } else if (pilihan == 2) {
                hasil = celsius * 1.8 + 32;
                konversi = "Fahrenheit";
            } else if (pilihan == 3) {
                hasil = celsius * 1.8 + 491.67;
                konversi = "Rankine";
            } else if (pilihan == 4) {
                hasil = (100 - celsius) * 1.5;
                konversi = "Delisle";
            } else if (pilihan == 5) {
                hasil = celsius * 33 / 100;
                konversi = "Newton";
            } else if (pilihan == 6) {
                hasil = celsius * 0.8;
                konversi = "Réaumur";
            } else if (pilihan == 7) {
                hasil = celsius * 21 / 40 + 7.5;
                konversi = "Rømer";
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                continue;
            }
            
            System.out.println("Suhu dalam " + konversi + ": " + hasil);
        }
        
        scanner.close();
    }
}
