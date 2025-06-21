package Praktikum10.Latihan1;

import javax.swing.*;
import java.awt.event.*;

public class MiniKalkulator extends JFrame {
    JTextField nilai1, nilai2, hasil;

    public MiniKalkulator() {
        setTitle("Mini Kalkulator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Nilai Pertama:");
        label1.setBounds(10, 10, 100, 20);
        add(label1);

        nilai1 = new JTextField();
        nilai1.setBounds(120, 10, 150, 25);
        add(nilai1);

        JLabel label2 = new JLabel("Nilai Kedua:");
        label2.setBounds(10, 40, 100, 20);
        add(label2);

        nilai2 = new JTextField();
        nilai2.setBounds(120, 40, 150, 20);
        add(nilai2);

        JLabel labelHasil = new JLabel("Hasil:");
        labelHasil.setBounds(10, 70, 100, 20);
        add(labelHasil);
        
        hasil = new JTextField();
        hasil.setBounds(120, 70, 150, 20);
        hasil.setEditable(false);
        add(hasil);

        JButton tambahButton = new JButton("Tambah");
        tambahButton.setBounds(10, 100, 100, 25);
        add(tambahButton);

        JButton kurangButton = new JButton("Kurang");
        kurangButton.setBounds(120, 100, 100, 25);
        add(kurangButton);

        JButton kaliButton = new JButton("Kali");
        kaliButton.setBounds(10, 130, 100, 25);
        kaliButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(nilai1.getText());
                int b = Integer.parseInt(nilai2.getText());
                hasil.setText(String.valueOf(a * b));
            }
        });
        add(kaliButton);

        JButton bagiButton = new JButton("Bagi");
        bagiButton.setBounds(120, 130, 100, 25);
        add(bagiButton);

        JButton btnPangkat = new JButton("Pangkat");
        btnPangkat.setBounds(10, 160, 100, 25);
        add(btnPangkat);

        JButton btnAkar = new JButton("Akar");
        btnAkar.setBounds(120, 160, 100, 25);
        add(btnAkar);

        tambahButton.addActionListener(e -> operasi("+"));
        kurangButton.addActionListener(e -> operasi("-"));
        kaliButton.addActionListener(e -> operasi("*"));
        bagiButton.addActionListener(e -> operasi("/"));
        btnPangkat.addActionListener(e -> operasi("^"));
        btnAkar.addActionListener(e -> operasi("sqrt"));

        setVisible(true);
    }

    private void operasi(String operator) {
        try {
            double a = Double.parseDouble(nilai1.getText());
            double b = operator.equals("sqrt") ? 0 : Double.parseDouble(nilai2.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = b == 0 ? Double.NaN : a / b; // Cek pembagian dengan nol
                    break;
                case "^":
                    result = Math.pow(a, b);
                    break;
                case "sqrt":
                    result = Math.sqrt(a);
                    break;
            }

            hasil.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            hasil.setText("Input tidak valid");
        }
    }

    public static void main(String[] args) {
        new MiniKalkulator();
    }
}
