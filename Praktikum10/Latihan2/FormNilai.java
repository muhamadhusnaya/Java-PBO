package Praktikum10.Latihan2;

import javax.swing.*;
import java.awt.event.*;

public class FormNilai extends JFrame {
    private JTextField txtNIM, txtNama, txtTugas, txtUTS, txtUAS;
    private JButton btnHitung;
    private JLabel lblNilaiAkhir, lblHuruf, lblPredikat;

    public FormNilai() {
        setTitle("Aplikasi Hitung Nilai Mahasiswa");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNIM = new JLabel("NIM:");
        lblNIM.setBounds(20, 20, 100, 25);
        add(lblNIM);
        txtNIM = new JTextField();
        txtNIM.setBounds(150, 20, 200, 25);
        add(txtNIM);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 50, 100, 25);
        add(lblNama);
        txtNama = new JTextField();
        txtNama.setBounds(150, 50, 200, 25);
        add(txtNama);
        
        JLabel lblTugas = new JLabel("Nilai Tugas:");
        lblTugas.setBounds(20, 80, 100, 25);
        add(lblTugas);
        txtTugas = new JTextField();
        txtTugas.setBounds(150, 80, 200, 25);
        add(txtTugas);

        JLabel lblUTS = new JLabel("Nilai UTS:");
        lblUTS.setBounds(20, 110, 100, 25);
        add(lblUTS);
        txtUTS = new JTextField();
        txtUTS.setBounds(150, 110, 200, 25);
        add(txtUTS);
        
        JLabel lblUAS = new JLabel("Nilai UAS:");
        lblUAS.setBounds(20, 140, 100, 25);
        add(lblUAS);
        txtUAS = new JTextField();
        txtUAS.setBounds(150, 140, 200, 25);
        add(txtUAS);

        btnHitung = new JButton("Hitung Nilai");
        add(btnHitung);
        btnHitung.setBounds(150, 180, 100, 30);

        JLabel lblNAkhir = new JLabel("Nilai Akhir:");
        lblNAkhir.setBounds(20, 220, 100, 25);
        add(lblNAkhir);
        lblNilaiAkhir = new JLabel("-");
        lblNilaiAkhir.setBounds(150, 220, 200, 25);
        add(lblNilaiAkhir);

        lblHuruf = new JLabel("Nilai Huruf:");
        lblHuruf.setBounds(20, 250, 100, 25);
        add(lblHuruf);
        lblHuruf = new JLabel("-");
        lblHuruf.setBounds(150, 250, 200, 25);
        add(lblHuruf);

        lblPredikat = new JLabel("Predikat:");
        lblPredikat.setBounds(20, 280, 100, 25);
        add(lblPredikat);
        lblPredikat = new JLabel("-");
        lblPredikat.setBounds(150, 280, 200, 25);
        add(lblPredikat);

        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tugas = Double.parseDouble(txtTugas.getText());
                    double uts = Double.parseDouble(txtUTS.getText());
                    double uas = Double.parseDouble(txtUAS.getText());

                    double nilaiAkhir = (tugas * 0.2) + (uts * 0.5) + (uas * 0.45);
                    lblNilaiAkhir.setText(String.format("%.2f", nilaiAkhir));

                    // Langsung menetapkan nilai huruf dan predikat ke dalam JLabel
                    if (nilaiAkhir >= 85) {
                        lblHuruf.setText("A");
                        lblPredikat.setText("Sangat Baik");
                    } else if (nilaiAkhir >= 70) {
                        lblHuruf.setText("B");
                        lblPredikat.setText("Baik");
                    } else if (nilaiAkhir >= 60) {
                        lblHuruf.setText("C");
                        lblPredikat.setText("Cukup");
                    } else if (nilaiAkhir >= 50) {
                        lblHuruf.setText("D");
                        lblPredikat.setText("Kurang");
                    } else {
                        lblHuruf.setText("E");
                        lblPredikat.setText("Sangat Kurang");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input tidak valid. Pastikan semua nilai diisi dengan benar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormNilai();
    }
}
