import java.util.Scanner;

public class Minggu9 {

    // No. 1 - Mengembalikan luas persegi panjang
    static int luasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    // No. 2 - Menghitung factorial dari n
    static int factorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

    // No. 3 - Penjumlahan (int)
    static int hitung(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    // No. 3 - Perkalian (double)
    static double hitung(double a, double b) {
        double hasil = a * b;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === No. 1: Luas Persegi Panjang ===
        System.out.println("=== No. 1: Luas Persegi Panjang ===");
        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang(panjang, lebar));

        // === No. 2: Factorial ===
        System.out.println("\n=== No. 2: Factorial ===");
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.println("Factorial dari " + n + " = " + factorial(n));

        // === No. 3: Penjumlahan dan Perkalian ===
        System.out.println("\n=== No. 3: Penjumlahan (int) ===");
        System.out.print("Masukkan nilai a (int): ");
        int a1 = scanner.nextInt();
        System.out.print("Masukkan nilai b (int): ");
        int b1 = scanner.nextInt();
        System.out.println("Hasil penjumlahan: " + hitung(a1, b1));

        System.out.println("\n=== No. 3: Perkalian (double) ===");
        System.out.print("Masukkan nilai a (double): ");
        double a2 = scanner.nextDouble();
        System.out.print("Masukkan nilai b (double): ");
        double b2 = scanner.nextDouble();
        System.out.println("Hasil perkalian: " + hitung(a2, b2));

        scanner.close();
    }
}