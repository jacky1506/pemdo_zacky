import java.util.Scanner;

public class tokoJaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        String namaBarang;
        double hargaBarang;
        int jumlahBeli;
        double totalBayar;
        double uangBayar;
        double kembalian;

        // Input
        System.out.print("Masukkan nama barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        jumlahBeli = input.nextInt();

        // Proses
        totalBayar = hargaBarang * jumlahBeli;

        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextDouble();

        kembalian = uangBayar - totalBayar;

        // Output
        System.out.println("\n=== STRUK BELANJA ===");
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Bayar  : " + totalBayar);
        System.out.println("Uang Bayar   : " + uangBayar);
        System.out.println("Kembalian    : " + kembalian);

        input.close();
    }
}