package Praktikum13;

import javax.swing.SwingUtilities;

// Kelas utama (main) untuk menjalankan aplikasi
public class Main {
    public static void main(String[] args) {
        // Jalankan tampilan di thread GUI
        SwingUtilities.invokeLater(() -> {
            ObatView view = new ObatView();         // Buat view
            new ObatController(view);               // Hubungkan dengan controller
            view.setVisible(true);                  // Tampilkan jendela
        });
    }
}
