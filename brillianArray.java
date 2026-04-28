import java.util.Scanner;

public class brillianArray {

    // Array 1 dimensi untuk menyimpan data
    static String[] kategori  = new String[0];
    static int[]    harga     = new int[0];
    static int[]    jumlahBeli = new int[0];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menuLoop:
        while (true) {
            System.out.println("\n===== PEMESANAN TIKET SURABAYAZOO =====");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu (1-4): ");

            String pilihan = sc.nextLine();

            // =====================
            // MENU 1-4: Pilihan Menu
            // =====================
            switch (pilihan) {
                case "1":
                    System.out.println("\n--- Input Kategori dan Harga ---");
                    System.out.print("Masukkan jumlah kategori tiket: ");
                    int n = Integer.parseInt(sc.nextLine());

                    // Buat array baru sesuai jumlah kategori
                    kategori   = new String[n];
                    harga      = new int[n];
                    jumlahBeli = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nKategori ke-" + (i + 1) + ":");
                        System.out.print("  Nama Kategori : ");
                        kategori[i] = sc.nextLine();
                        System.out.print("  Harga Tiket   : Rp ");
                        harga[i]    = Integer.parseInt(sc.nextLine());
                        jumlahBeli[i] = 0; // default
                    }

                    System.out.println("\nData kategori berhasil disimpan!");
                    break;

                case "2":
                    if (kategori.length == 0) {
                        System.out.println("\nBelum ada data kategori! Silakan isi Menu 1 terlebih dahulu.");
                    } else {
                        System.out.println("\n--- Input Jumlah Tiket yang Dibeli ---");
                        for (int i = 0; i < kategori.length; i++) {
                            System.out.println("Kategori : " + kategori[i] + " | Harga : Rp " + harga[i]);
                            System.out.print("  Jumlah beli tiket '" + kategori[i] + "': ");
                            jumlahBeli[i] = Integer.parseInt(sc.nextLine());
                        }
                        System.out.println("\nJumlah tiket berhasil disimpan!");
                    }
                    break;

                case "3":
                    if (kategori.length == 0) {
                        System.out.println("\nBelum ada data! Silakan isi Menu 1 dan Menu 2 terlebih dahulu.");
                    } else {
                        System.out.println("\n--- TOTAL BAYAR ---");
                        System.out.println("Kategori\tHarga\tJumlah\tSubtotal");
                        System.out.println("-------------------------------------------------");

                        int totalBayar = 0;
                        for (int i = 0; i < kategori.length; i++) {
                            int subtotal = harga[i] * jumlahBeli[i];
                            totalBayar += subtotal;
                            System.out.println(kategori[i] + "\tRp " + harga[i] + "\t" + jumlahBeli[i] + "\tRp " + subtotal);
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("TOTAL: Rp " + totalBayar);
                    }
                    break;

                case "4":
                    System.out.println("\nTerima kasih sudah menggunakan aplikasi Tiket SurabayaZoo!");
                    System.out.println("Sampai jumpa :)");
                    break menuLoop;

                default:
                    System.out.println("\nPilihan tidak valid! Masukkan angka 1-4.");
                    break;
            }
        }

        sc.close();
    }
}