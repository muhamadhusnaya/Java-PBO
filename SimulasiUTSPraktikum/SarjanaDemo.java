package SimulasiUTSPraktikum;

public class SarjanaDemo {
    public static boolean isAlamatSama(Sarjana a1, Sarjana a2) {
        boolean alamatSama;
        a1.getAlamat().toLowerCase();
        a2.getAlamat().toLowerCase();
        if(a1.getAlamat().equals(a2.getAlamat())) {
            alamatSama = true;
        } else {
            alamatSama = false;
        }

        return alamatSama;
    }

    public static double min2(double a, double b) {
        double min2;
        if(a < b) {
            min2 = a;
        } else {
            min2 = b;
        }

        return min2;
    }
    
    public static void main(String[] args) {
        Sarjana s[] = new Sarjana[3];
        s[0] = new Sarjana("Dilan", "Bandung", 1, 3.51);
        s[1] = new Sarjana("Milea", "Jakarta", 2, 3.0);
        s[2] = new Sarjana();
        s[2].reset("Cinta", "Bandung", 3, 1.75);

        System.out.println("Data Mahasiswa Universitas Fiksi");
        System.out.println("================================"); System.out.println("");
        for(int i = 0; i < s.length; i++) {
            s[i].cetak(); System.out.println("");
        }
        System.out.println("================================");

        System.out.println("");
        System.out.println("Catatan :");
        System.out.print("- Alamat Dilan dan Cinta ");
        if(isAlamatSama(s[0], s[2])) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        if(s[0].getIpk() < min2(s[1].getIpk(), s[2].getIpk())) {
            System.out.println("- IPK terkecil adalah " + s[0].getIpk() + " milik " + s[0].getNama());
        } else if(s[1].getIpk() < min2(s[0].getIpk(), s[2].getIpk())) {
            System.out.println("- IPK terkecil adalah " + s[1].getIpk() + " milik " + s[1].getNama());
        } else {
            System.out.println("- IPK terkecil adalah " + s[2].getIpk() + " milik " + s[2].getNama());
        }
    }
}