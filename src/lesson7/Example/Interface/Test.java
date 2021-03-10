package lesson7.Example.Interface;

import lesson5.Example.User;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();

        String email = ""; // scan tu nguoi dung
        User user = userService.findUserByEmail(email);

        /*if (user != null) {
            userService.sendTokenToEmail();
        }*/
    }
}
