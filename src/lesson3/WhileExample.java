package lesson3;

public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        /*while (i < 5){
            System.out.println("xin chao " + i);
            System.out.println("hello");
            i++;
        }*/
        do {
            System.out.println("xin chao " + i);
            i++;
        } while (i < 5);
    }
}
