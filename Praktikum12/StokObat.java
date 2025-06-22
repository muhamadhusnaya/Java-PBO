package Praktikum12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StokObat extends JFrame {
    private JTextField tfNama, tfKode, tfHarga;
    private JButton btnTambah, btnHapus;
    private JTable tableObat;
    private DefaultTableModel model;
    private ArrayList<Obat> daftarObat = new ArrayList<>();

    public StokObat() {
        setTitle("Manajemen Stok Obat");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblKode = new JLabel("Kode Obat:");
        JLabel lblNama = new JLabel("Nama Obat:");
        JLabel lblHarga = new JLabel("Harga Obat:");

        tfKode = new JTextField();
        tfNama = new JTextField();
        tfHarga = new JTextField();

        btnTambah = new JButton("Tambah Obat");
        btnHapus = new JButton("Hapus Obat");

        lblKode.setBounds(20, 20, 100, 25);
        tfKode.setBounds(130, 20, 150, 25);
        lblNama.setBounds(20, 60, 100, 25);
        tfNama.setBounds(130, 60, 150, 25);
        lblHarga.setBounds(20, 100, 100, 25);
        tfHarga.setBounds(130, 100, 150, 25);
        btnTambah.setBounds(300, 20, 100, 25);
        btnHapus.setBounds(300, 60, 100, 25);

        model = new DefaultTableModel(new String []{"Kode Obat", "Nama Obat", "Harga Obat"}, 0);
        tableObat = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tableObat);
        scrollPane.setBounds(20, 150, 540, 200);

        add(lblKode);
        add(tfKode);
        add(lblNama);
        add(tfNama);
        add(lblHarga);
        add(tfHarga);
        add(btnTambah);
        add(btnHapus);
        add(scrollPane);

        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tambahObat();
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hapusObat();
            }
        });
    }

    private void tambahObat() {
        try {
            String kode = tfKode.getText();
            String nama = tfNama.getText();
            double harga = Double.parseDouble(tfHarga.getText());

            Obat obat = new Obat(kode, nama, harga);
            daftarObat.add(obat);
            model.addRow(new Object[]{kode, nama, harga});

            tfKode.setText("");
            tfNama.setText("");
            tfHarga.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapusObat() {
        int selectedRow = tableObat.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
            daftarObat.remove(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih obat yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StokObat().setVisible(true));
    }
}
