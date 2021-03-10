package lesson7.Example.Abstract;

public class Test {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.print("Phuc");
        childClass.printInfo("Phuc");

        Child2Class child2Class = new Child2Class();
        child2Class.printInfo("Vy");

        AbstractClassEx[] abstractClassExes = new AbstractClassEx[10];
    }
}
