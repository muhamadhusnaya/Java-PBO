package Praktikum13;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

// Controller yang mengatur logika aplikasi
public class ObatController {
    private ArrayList<Obat> daftarObat = new ArrayList<>(); // List data obat
    private ObatView view; // Referensi ke view

    // Konstruktor controller
    public ObatController(ObatView view) {
        this.view = view;

        // Aksi ketika tombol tambah ditekan
        this.view.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahObat();
            }
        });

        // Aksi ketika tombol hapus ditekan
        this.view.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusObat();
            }
        });

        this.view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateObat();
            }
        });
    }
    

    // Fungsi untuk menambahkan data obat
    private void tambahObat() {
        try {
            // Ambil data dari text field
            String kode = view.tfKode.getText();
            String nama = view.tfNama.getText();
            double harga = Double.parseDouble(view.tfHarga.getText());

            // Buat objek obat dan tambahkan ke list
            Obat obat = new Obat(kode, nama, harga);
            daftarObat.add(obat);

            // Tambahkan baris ke tabel
            view.tableModel.addRow(new Object[]{kode, nama, harga});

            // Kosongkan field input
            view.tfKode.setText("");
            view.tfNama.setText("");
            view.tfHarga.setText("");
        } catch (NumberFormatException ex) {
            // Tampilkan error jika harga bukan angka
            JOptionPane.showMessageDialog(view, "Harga harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Fungsi untuk menghapus data obat
    private void hapusObat() {
        int selectedRow = view.tableObat.getSelectedRow(); // Ambil baris yang dipilih
        if (selectedRow != -1) {
            // Hapus baris dari tabel dan dari list
            view.tableModel.removeRow(selectedRow);
            daftarObat.remove(selectedRow);
        } else {
            // Tampilkan pesan jika belum memilih baris
            JOptionPane.showMessageDialog(view, "Pilih obat yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateObat() {
        int selectedRow = view.tableObat.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String kode = view.tfKode.getText();
                String nama = view.tfNama.getText();
                double harga = Double.parseDouble(view.tfHarga.getText());

                // Update ke dalam model data
                Obat updatedObat = new Obat(kode, nama, harga);
                daftarObat.set(selectedRow, updatedObat);

                // Update ke tabel
                view.tableModel.setValueAt(kode, selectedRow, 0);
                view.tableModel.setValueAt(nama, selectedRow, 1);
                view.tableModel.setValueAt(harga, selectedRow, 2);

                JOptionPane.showMessageDialog(view, "Data berhasil di-update.");

                // Kosongkan input
                view.tfKode.setText("");
                view.tfNama.setText("");
                view.tfHarga.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Harga harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(view, "Pilih baris data yang ingin di-update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
