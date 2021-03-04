package lesson6.Example.animals;

public class AppTest {
    public static void main(String[] args) {

        // khai báo cha -> quản lý chung tất cả các con
        Animals[] animals = new Animals[3];

        Animals b = new Dog();
        animals[0] = b;

        Animals s = new Spider();
        animals[1] = s;

        Animals c = new Chicken();
        animals[2] = c;

        for (Animals a : animals){
            System.out.println(a.getTotalLegs());
        }
    }
}
