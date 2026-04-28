public class SemuaSoal {
    public static void main(String[] args) {
        soal1();
        System.out.println("\n");
        soal2();
        System.out.println("\n");
        soal3();
        System.out.println("\n");
        soal4();
    }

    public static void soal1() {
        System.out.println("=== SOAL 1 - ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print( " * ");
            }
            System.out.println();
        }
    }

    public static void soal2() {
        System.out.println("=== SOAL 2 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void soal3() {
        System.out.println("=== SOAL 3 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void soal4() {
        System.out.println("=== SOAL 4 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
