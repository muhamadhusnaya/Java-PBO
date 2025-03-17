public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        System.out.println("Pertambahan: 20 + 20 = " + mtk.pertambahan(20, 20));

        System.out.println("Pengurangan: 10 - 5 = " + mtk.pengurangan(10, 5));

        System.out.println("Perkalian: 10 x 20 = " + mtk.perkalian(10, 20));

        System.out.println("Pembagian: 20 / 2 = " + mtk.pembagian(20, 2));
    }
}