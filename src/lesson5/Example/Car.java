package lesson5.Example;

public class Car {
    private float speed;
    private boolean close;

    public void setClose(boolean value) {
        if (speed > 20) {
            close = true;
        } else {
            close = value;
        }
    }
}
