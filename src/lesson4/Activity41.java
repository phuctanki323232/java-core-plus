package lesson4;

public class Activity41 {
    public static void main(String[] args) {

        int r;

        for (int i = 1; i <= 500; i++) {
            int temp = i;
            int sum =0;

            while (temp != 0){
                r = temp % 10;
                sum += Math.pow(r, 3);
                temp /= 10;
            }
            if (sum == i) System.out.print(i + ", ");
        }
    }
}
