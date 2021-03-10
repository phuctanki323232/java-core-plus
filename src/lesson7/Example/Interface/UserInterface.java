// bao quat hon, de nhin, de tim

package lesson7.Example.Interface;

import lesson5.Example.User;

public interface UserInterface extends InterfaceC, InterfaceB {
    /*static final String name = null;
    void print();*/

    // Dang ky
    void verifyRequest(String name);
    User findUserByName(String name);
    int saveUserIntoBD(User user);

    // Sua thong tin
    User updateUserInfo(User user);

    // Quen mat khau
    User findUserByEmail(String email);
    void sendTokenToEmail(String token, String email);

    // Xoa user
    void deleteUser(String username);
}
