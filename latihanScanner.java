//1. import class
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner Z = new Scanner(System.in);

        //3. input (deklarasi variabel)
        //value dlm variabel harus diberikan deafault
        String namaBarang ="";
        int harga = 0, jumlahBeli = 0, total = 0;

        //teks input
        System.out.print("Nama barang : ");
        namaBarang = Z.nextLine(); // nextLine utk String

        System.out.print("Harga barang : ");
        harga = Z.nextInt(); // nextInt utk integer

        System.out.print("Jumlah Beli : ");
        jumlahBeli = Z.nextInt(); // nextInt utk integer

        //4. output
        System.out.println("Nama barang: " + namaBarang);
        total = harga * jumlahBeli;
        System.out.println("Total : " + total);

        //5. close scanner
        Z.close();
    }
}
