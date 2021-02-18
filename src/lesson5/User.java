package lesson5;

public class User {
    private String name;
    private String age;
    private String address;
    private String username;
    private String password;
    private String phone;
    private String email;

    public boolean checkpass (String pass) {
        if (password.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        /*Test test = new Test();
        test.print();*/
    }
}
