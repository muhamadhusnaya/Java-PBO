public class Array1 {
    public static void main(String[] args) {
        int array[] = {68, 7, 28, 90, 32};

        System.out.println("Jumlah Data : " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Data ke - " + (i + 1) + " = " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + array[i]);
        }

        System.out.println("\nBUILD SUCCESSFUL (total time: 15 seconds)");
    }
}
