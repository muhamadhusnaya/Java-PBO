import java.util.Scanner;

public class Matrik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        int[][] C = new int[10][10];
        int[][] D = new int[10][10];
        int[][] E = new int[10][10];
        int jlh = 0, hsl = 1, i, j, n, m, a, b, k;

        System.out.print("input baris matrix A=");
        n = in.nextInt();
        System.out.print("input kolom matrix A=");
        m = in.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("input elemen matrix A [" + i + "," + j + "] =");
                A[i][j] = in.nextInt();
            }
        }

        System.out.print("input baris matrix B=");
        a = in.nextInt();
        System.out.print("input kolom matrix B=");
        b = in.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("input elemen matrix B [" + i + "," + j + "] =");
                B[i][j] = in.nextInt();
            }
        }

        if (n == a && m == b) {
            System.out.println("Hasil penjumlahan matrik A\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nHasil transfos matrix C=\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    D[i][j] = C[j][i];
                    System.out.print(D[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("data tidak dapat diproses");
        }

        if (m == a) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < b; j++) {
                    E[i][j] = 0;
                    for (k = 0; k < a; k++) {
                        E[i][j] = E[i][j] + (A[i][k] * B[k][j]);
                    }
                }
            }

            System.out.println("\nHasil perkalian matrix A dengan matrix B =\n");
            for (i = 0; i < n; i++) {
                for (j = 0; j < b; j++) {
                    System.out.print(E[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("data tidak bisa di proses");
        }
    }
}
