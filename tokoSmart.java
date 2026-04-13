import java.util.Scanner;

public class tokoSmart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        String namaBarang;
        double hargaBarang;
        int jumlahBeli;
        double totalBayar;
        double uangBayar;
        double kembalian;

        // Proses
        System.out.print("Nama barang: ");
        namaBarang = input.nextLine();

        System.out.print("Harga barang: ");
        hargaBarang = input.nextDouble();

        System.out.print("Jumlah beli: ");
        jumlahBeli = input.nextInt();

        totalBayar = hargaBarang * jumlahBeli;

        System.out.print("Uang bayar: ");
        uangBayar = input.nextDouble();

        kembalian = uangBayar - totalBayar;

        // Output 
        System.out.println("\n--- Struk ---");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Harga: " + hargaBarang);
        System.out.println("Jumlah: " + jumlahBeli);
        System.out.println("Total: " + totalBayar);
        System.out.println("Bayar: " + uangBayar);
        System.out.println("Kembalian: " + kembalian);

        input.close();
    }
}