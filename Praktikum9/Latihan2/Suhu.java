import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Suhu extends JFrame {
    private JTextField n1 = new JTextField(5);
    private JTextField n2 = new JTextField(5);
    private JButton btnProses = new JButton("Proses");
    private JTable tblSuhu = new JTable();

    int baris, kol;
    private Object[][] dataTable = null;
    private String[] header = { "No", "Celcius", "Fahrenheit", "Kelvin", "Reamur" };

    public Suhu() {
        setTitle("Konversi Suhu");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        add(new JLabel("Nilai Awal")).setBounds(20, 20, 50, 25);
        add(n1).setBounds(70, 20, 100, 25);

        add(new JLabel("Nilai Akhir")).setBounds(200, 20, 70, 25);
        add(n2).setBounds(270, 20, 100, 25);

        btnProses.setBounds(380, 20, 80, 25);
        add(btnProses);
        
        JScrollPane scrollPane = new JScrollPane(tblSuhu);
        scrollPane.setBounds(20, 60, 440, 280);
        add(scrollPane);

        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int awal = Integer.parseInt(n1.getText());
                    int akhir = Integer.parseInt(n2.getText());
                    kol = 5;
                    baris = (akhir - awal + 1);
                    dataTable = new Object[baris][kol];
                    int c = 0;
                    int x = 0;
                    

                    for (c = awal; c <= akhir; c++) {
                        double fahrenheit = 1.8 * c + 32;
                        double kelvin = c + 273.15;
                        double reamur = 0.8 * c;

                        dataTable[x][0] = x + 1; // No
                        dataTable[x][1] = c; // Celcius
                        dataTable[x][2] = String.format("%.2f", fahrenheit); // Fahrenheit
                        dataTable[x][3] = String.format("%.2f", kelvin); // Kelvin
                        dataTable[x][4] = String.format("%.2f", reamur); // Reamur
                        x++;
                    }
                    tblSuhu.setModel(new DefaultTableModel(dataTable, header));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Suhu();
    }
}
