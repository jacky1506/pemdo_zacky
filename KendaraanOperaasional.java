import java.util.Scanner;

public class KendaraanOperasional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jarak;
        double totalJarak = 0;

        System.out.println("=== Pencatatan Jarak Kendaraan Operasional ===");

        while (true) {
            System.out.print("Masukkan jarak tempuh (negatif untuk selesai): ");

            if (!input.hasNextDouble()) {
                System.out.println("Input harus berupa angka!");
                input.next(); // buang input salah
                continue;
            }

            jarak = input.nextDouble();

            if (jarak < 0) {
                break;
            }

            totalJarak += jarak;
        }

        System.out.println("Total jarak tempuh kendaraan: " + totalJarak + " km");

        input.close();
    }
}