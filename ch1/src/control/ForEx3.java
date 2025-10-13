package control;

public class ForEx3 {
    public static void main(String[] args) {
        // **********
        // **********
        // **********
        // **********
        // **********
        // System.out.println("**********");
        // System.out.println("**********");
        // System.out.println("**********");
        // System.out.println("**********");
        // System.out.println("**********");

        // 중첩 for
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2 * 1 = 2
        // 2 * 2 = 4
        // 3 * 1 = 3
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
