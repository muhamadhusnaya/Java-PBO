package Latihan2;

import java.util.Scanner;

public class RumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        double D = (b * b) - (4 * a * c);

        int caseValue;
        if (D > 0) {
            caseValue = 1;
        } else if (D == 0) {
            caseValue = 2;
        } else {
            caseValue = 3;
        }

        switch (caseValue) {
            case 1: // D > 0 (Akar Real dan Berbeda)
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Akar-akar persamaan kuadrat:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
                break;

            case 2: // D = 0 (Akar Real dan Sama)
                double x = -b / (2 * a);
                System.out.println("Akar-akar persamaan kuadrat:");
                System.out.println("X1 = X2 = " + x);
                break;

            case 3: // D < 0 (Akar Imajiner)
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-D) / (2 * a);
                System.out.println("\nAkar-akar persamaan kuadrat:");
                System.out.println("X1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("X2 = " + realPart + " - " + imaginaryPart + "i");
                break;

            default:
                System.out.println("Terjadi kesalahan.");
        }
        
        input.close();
    }
}
