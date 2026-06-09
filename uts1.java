import java.util.Scanner;

public class uts1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // minta input batas lulus dulu
        System.out.print("Masukkan nilai minimum kelulusan: ");
        int batasKelulusan = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jumlah peserta ujian (minimal 5): ");
        int n = input.nextInt();
        input.nextLine();

        if (n < 5) {
            System.out.println("Jumlah peserta minimal 5 orang!");
            input.close();
            return;
        }

        String[] nama = new String[n];
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Peserta ke-" + (i + 1) + " ---");
            System.out.print("Masukkan nama peserta : ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan nilai ujian  : ");
            nilai[i] = input.nextInt();
            input.nextLine();
        }

        // hitung yang lulus dan tidak
        int lulus = 0, tidakLulus = 0;
        for (int i = 0; i < n; i++) {
            if (nilai[i] >= batasKelulusan) {
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

        for (int i = 0; i < n; i++) {
            String ket = (nilai[i] >= batasKelulusan) ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "    " + nama[i] + "                " + nilai[i] + "      " + ket);
        }

        System.out.println("==============================================");
        System.out.println("Nilai minimum kelulusan : " + batasKelulusan);
        System.out.println("Total peserta           : " + n);
        System.out.println("Jumlah lulus            : " + lulus);
        System.out.println("Jumlah tidak lulus      : " + tidakLulus);
        System.out.println("==============================================");

        input.close();
    }
}