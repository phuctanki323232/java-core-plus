package lesson3;

public class Activity34 {
    public static void main(String[] args) {

        System.out.println("Deivided by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i == 100/3 * 3) {
                System.out.println(i + ".");
                break;
            }
            if (i % 3 == 0) System.out.print(i + ", ");
        }

        System.out.println("Deivided by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i == 100/5 * 5) {
                System.out.println(i + ".");
                break;
            }
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("Deivided by 3 & 5:");
        for (int i = 1; i <= 100; i++) {
            if (i == 100/15 * 15) {
                System.out.println(i + ".");
                break;
            }
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }
    }
}
