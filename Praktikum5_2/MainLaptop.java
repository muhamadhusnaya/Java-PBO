package Praktikum5_2;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS ROG", 25000000, 16, "Intel i9", "NVIDIA RTX 3060", 15.6);
        Laptop laptop2 = new Laptop("MacBook Pro", 32000000, 16, "Apple M2", "Apple GPU", 14.0);
        Laptop laptop3 = new Laptop("Lenovo Legion", 20000000, 16, "AMD Ryzen 7", "NVIDIA GTX 1660Ti", 16.0);

        laptop1.infoProduk();
        System.out.println();

        laptop2.infoProduk("Apple M3 GPU"); // Overloading
        System.out.println();

        laptop3.infoProduk();
    }
}
