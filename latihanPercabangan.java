import java.util.Scanner;
public class latihanPercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");

        //daftar member (nama, alamat, no hp)
        String namaMember="", alamatMember="", noHpMember="";
        String jawab = "";

        //transaksi pembelian (nama barang, harga, jumlah beli, total bayar, uang bayar, kembalian)
        String namaBarang="";
        int hargaBarang=0, jumlahBeli=0, total=0, diskon=0, grandTotal=0;
        


        //ditanyakan dulu mau member atau tidak
        //berikan teks input
        System.out.print("Apakah Anda ingin menjadi member? (y/n): ");
        jawab = scanner.nextLine();

        //cek jawaban user, jawabannya bisa y atau n menggunakan
        //equals = case sensitive (perhatikan kapital tdk nya)
        //equalsIgnoreCase = case insensitive (tidak memperhatikan kapital tdk nya)
        if (jawab.equalsIgnoreCase("y")) {
            //jika user ingin menjadi member, maka input data member
            System.out.print("Masukkan nama: ");
            namaMember = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            alamatMember = scanner.nextLine();

            System.out.print("Masukkan no hp: ");
            noHpMember = scanner.nextLine();

            //output data member
            System.out.println("\n--- Data Member ---");
            System.out.println("Nama: " + namaMember);
            System.out.println("Alamat: " + alamatMember);
            System.out.println("No HP: " + noHpMember);

            System.out.println( "ingin membeli barang? (y/n): ");
            jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("y")) {

                //jika user ingin membeli barang, maka input data pembelian
                System.out.print("Nama barang: ");
                namaBarang = scanner.nextLine();

                System.out.print("Harga barang: ");
                hargaBarang = scanner.nextInt();

                System.out.print("Jumlah beli: ");
                jumlahBeli = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                total = hargaBarang * jumlahBeli;

                //berikan diskon 10% jika total bayar > 100.000
                total = hargaBarang * jumlahBeli;
                System.out.println("Total: " + total);
                if (total > 100000) {
                    diskon = (int) (total * 0.5 * 0.2);
                } else if (total > 500000) {
                    diskon = (int) (total * 0.1 * 0.2);
                
                }
            

                grandTotal = total - diskon;

                //output data pembelian
                System.out.println("\n--- Struk ---");
                System.out.println("Nama barang: " + namaBarang);
                System.out.println("Harga barang: " + hargaBarang);
                System.out.println("Jumlah beli: " + jumlahBeli);
                System.out.println("Total bayar: " + total);
                System.out.println("Diskon: " + diskon);
                System.out.println("Grand total: " + grandTotal);
                
            }
            
        } else {
            System.out.println("Anda tidak menjadi member.");
        }

        scanner.close();
    }

}

