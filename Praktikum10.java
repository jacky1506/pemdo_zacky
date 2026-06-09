import java.util.Scanner;

public class Praktikum10 {

    static void printGaris(String kar, int len) {
        String output = "";
        for (int x = 0; x < len; x++) {
            output = output + kar;
        }
        System.out.println(output);
    }

    static void dataMahasiswa(String nm, String id, double nilai) {
        String tampil1 = "Nama : " + nm;
        String tampil2 = "NIM  : " + id;
        String tampil3 = "IPK  : " + nilai;
        System.out.println(tampil1);
        System.out.println(tampil2);
        System.out.println(tampil3);
    }

    static void tabelPerkalian(int num) {
        int hasil;
        for (int x = 1; x <= 10; x++) {
            hasil = num * x;
            System.out.println(num + " x " + x + " = " + hasil);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String karakter = "=";

        System.out.print("cetak garis?: ");
        int panjang = input.nextInt();
        input.nextLine();

        System.out.print("masukkan nama: ");
        String nm = input.nextLine();

        System.out.print("masukkan nim: ");
        String id = input.nextLine();

        System.out.print("masukkan ipk: ");
        double nilai = input.nextDouble();
        input.nextLine();

        printGaris(karakter, panjang);
        System.out.println("none");
        printGaris(karakter, panjang);
        System.out.println("none");
        printGaris(karakter, panjang);
        System.out.println("none");
        printGaris(karakter, panjang);
        dataMahasiswa(nm, id, nilai);
        printGaris(karakter, panjang);

        System.out.print("masukkan perkalian: ");
        int num = input.nextInt();
        input.nextLine();

        printGaris(karakter, panjang);
        dataMahasiswa(nm, id, nilai);
        printGaris(karakter, panjang);
        tabelPerkalian(num);
        printGaris(karakter, panjang);

        input.close();
    }
}