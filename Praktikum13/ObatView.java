package Praktikum13;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

// Kelas tampilan (View) yang mewarisi JFrame
public class ObatView extends JFrame {
    // Komponen GUI yang dibutuhkan
    public JTextField tfKode = new JTextField();
    public JTextField tfNama = new JTextField();
    public JTextField tfHarga = new JTextField();
    public JButton btnTambah = new JButton("Tambah Obat");
    public JButton btnHapus = new JButton("Hapus Obat");

    public JTable tableObat;
    public DefaultTableModel tableModel;

    // Konstruktor untuk membangun GUI
    public ObatView() {
        setTitle("Manajemen Stok Obat - MVC");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Agar jendela muncul di tengah

        // Label dan posisi input
        JLabel lblKode = new JLabel("Kode Obat:");
        JLabel lblNama = new JLabel("Nama Obat:");
        JLabel lblHarga = new JLabel("Harga Obat:");

        // Atur posisi komponen di window
        lblKode.setBounds(20, 20, 100, 25);
        tfKode.setBounds(130, 20, 150, 25);
        lblNama.setBounds(20, 60, 100, 25);
        tfNama.setBounds(130, 60, 150, 25);
        lblHarga.setBounds(20, 100, 100, 25);
        tfHarga.setBounds(130, 100, 150, 25);

        btnTambah.setBounds(300, 20, 120, 25);
        btnHapus.setBounds(300, 60, 120, 25);

        // Inisialisasi tabel
        tableModel = new DefaultTableModel(new String[]{"Kode Obat", "Nama Obat", "Harga Obat"}, 0);
        tableObat = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableObat);
        scrollPane.setBounds(20, 150, 540, 200);

        // Tambahkan komponen ke jendela
        add(lblKode);
        add(tfKode);
        add(lblNama);
        add(tfNama);
        add(lblHarga);
        add(tfHarga);
        add(btnTambah);
        add(btnHapus);
        add(scrollPane);
    }
}
