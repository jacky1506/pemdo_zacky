import java.util.*;

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai minimum kelulusan: ");
        int nilai_minimum = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Masukkan jumlah peserta ujian (minimal 5): ");
        int jumlah_peserta = sc.nextInt();
        sc.nextLine(); // consume newline

        if (jumlah_peserta < 5) {
            System.out.println("Jumlah peserta minimal 5 orang!");
        } else {
            ArrayList<String> nama_peserta = new ArrayList<>();
            ArrayList<Integer> nilai_ujian = new ArrayList<>();

            for (int i = 0; i < jumlah_peserta; i++) {
                System.out.println("\n--- Peserta ke-" + (i + 1) + " ---");
                System.out.print("Masukkan nama peserta : ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nilai ujian  : ");
                int nilai = sc.nextInt();
                sc.nextLine(); // consume newline

                nama_peserta.add(nama);
                nilai_ujian.add(nilai);
            }

            System.out.println("\n============================================");
            System.out.println("         HASIL UJIAN PESERTA");
            System.out.println("============================================");
            System.out.println("No   Nama                 Nilai      Status");
            System.out.println("-".repeat(45));

            int jumlah_lulus = 0;
            int jumlah_gagal = 0;

            for (int i = 0; i < jumlah_peserta; i++) {
                String status;
                if (nilai_ujian.get(i) >= nilai_minimum) {
                    status = "LULUS";
                    jumlah_lulus++;
                } else {
                    status = "GAGAL";
                    jumlah_gagal++;
                }
                System.out.println((i+1) + "    " + nama_peserta.get(i) + "                    " + nilai_ujian.get(i) + "          " + status);
            }

            System.out.println("============================================");
            System.out.println("Nilai Minimum   : " + nilai_minimum);
            System.out.println("Total Peserta   : " + jumlah_peserta);
            System.out.println("Jumlah LULUS    : " + jumlah_lulus);
            System.out.println("Jumlah GAGAL    : " + jumlah_gagal);
            System.out.println("============================================");
        }
        sc.close();
    }
}