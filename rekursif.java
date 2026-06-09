import java.util.Scanner;

public class rekursif {

    static void cetakbintang(int n) {
        if (n == 0) return;
        System.out.println("*");
        cetakbintang(n - 1);
    }

    static void cetaknaik(int n) {
        if (n == 0) return;
        cetaknaik(n - 1);
        System.out.println(n);
    }

    static void hitungmundur(int n) {
        if (n == 0) return;
        System.out.println(n);
        hitungmundur(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. rekursif manggil diri sendiri");
        System.out.println("2. iteratif pake loop, rekursif manggil fungsi, memori rekursif lebih boros");

        System.out.print("n bintang = ");
        int b = sc.nextInt();
        sc.nextLine();
        cetakbintang(b);

        System.out.print("n = ");
        int a = sc.nextInt();
        sc.nextLine();
        cetaknaik(a);
        hitungmundur(a);
        System.out.println("posisi println dituker buat naik");

        System.out.println("error = StackOverflowError");

        sc.close();
    }
}