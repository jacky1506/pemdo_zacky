import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan batas nilai kelulusan: ");
        int batasLulus = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Masukkan jumlah peserta (minimal 5): ");
        int jumlahPeserta = keyboard.nextInt();
        keyboard.nextLine();

        if (jumlahPeserta < 5) {
            System.out.println("Maaf, minimal 5 peserta.");
            keyboard.close();
            return;
        }

        String[] namaPeserta = new String[jumlahPeserta];
        int[] nilaiPeserta = new int[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println();
            System.out.println("Peserta ke-" + (i + 1));
            System.out.print("Nama: ");
            namaPeserta[i] = keyboard.nextLine();
            System.out.print("Nilai: ");
            nilaiPeserta[i] = keyboard.nextInt();
            keyboard.nextLine();
        }

        int lulus = 0;
        int tidakLulus = 0;
        for (int i = 0; i < jumlahPeserta; i++) {
            if (nilaiPeserta[i] >= batasLulus) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\n==============================================");
        System.out.println("           HASIL UJIAN PESERTA");
        System.out.println("==============================================");
        System.out.println("No   Nama                 Nilai   Keterangan");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumlahPeserta; i++) {
            String status = nilaiPeserta[i] >= batasLulus ? "Lulus" : "Tidak lulus";
            System.out.println((i + 1) + ". " + namaPeserta[i] + "  " + nilaiPeserta[i] + "  " + status);
        }

        System.out.println("==============================");
        System.out.println("Batas nilai lulus : " + batasLulus);
        System.out.println("Peserta          : " + jumlahPeserta);
        System.out.println("Lulus            : " + lulus);
        System.out.println("Tidak lulus      : " + tidakLulus);
        System.out.println("==============================");
        System.out.println("Terima kasih sudah memasukkan data.");

        keyboard.close();
    }
}