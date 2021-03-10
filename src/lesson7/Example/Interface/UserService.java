package lesson7.Example.Interface;

import lesson5.Example.User;

public class UserService implements UserInterface{
    @Override
    public void verifyRequest(String name) {

    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public int saveUserIntoBD(User user) {
        return 0;
    }

    @Override
    public User updateUserInfo(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {

        return null;
    }

    @Override
    public void sendTokenToEmail(String token, String email) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void printBInfo() {

    }

    @Override
    public void printCInfo() {

    }
}
