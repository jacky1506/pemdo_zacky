import java.util.Scanner;

public class fungsiHuruf {

    static String cekNilai(int angka) {
        if (angka >= 80 && angka <= 100) {
            return "A";
        } else if (angka >= 75 && angka <= 79) {
            return "B+";
        } else if (angka >= 65 && angka <= 74) {
            return "B";
        } else {
            return "Di luar rentang";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String hasil = cekNilai(nilai);
        System.out.println("Nilai huruf: " + hasil);

        input.close();
    }

}

  