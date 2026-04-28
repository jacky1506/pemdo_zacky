public class LatihanArray {
    public static void main(String[] args) {

        int[] angka = {34, 67, 12, 80, 45, 19, 23, 78};

       
        int tertinggi = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > tertinggi) {
                tertinggi = angka[i];
            }
        }
        System.out.println("=== Cari Nilai Tertinggi ===");
        System.out.println("Nilai tertinggi: " + tertinggi);

       
        int cari = 10;
        boolean ketemu = false;

        System.out.println("\n=== Pencarian Angka " + cari + " ===");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ketemu = true;
                System.out.println("Angka " + cari + " ditemukan di indeks ke-" + i);
            }
        }
        if (!ketemu) {
            System.out.println("Angka " + cari + " tidak ada dalam array.");
        }

        
        System.out.println("\n=== Membalik Array ===");
        System.out.print("Array asli    : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.print("\nArray terbalik: ");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}