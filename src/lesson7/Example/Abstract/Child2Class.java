package lesson7.Example.Abstract;

import lesson5.Example.User;

public class Child2Class extends AbstractClassEx{

    @Override
    public void printInfo(String name) {
        System.out.println("Hello " + name + " from Child2");
    }

    @Override
    public void verifyRequest(String name) {

    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public int saveUserIntoDB(User user) {
        return 0;
    }
}
