package lesson5;

/*Viết lớp Rectangle  có:
        - Các thuộc tính:
        + width
        + height
        - Các phương thức:
        + Khởi tạo
        + Getters/Setters
        + Tính chu vi
        + Tính hiện tích
        + In ra width, height
        + Kiểm tra xem có là hình vuông không.

        - Viết lớp Test để test thử. (width và height nhập từ bàn phím)*/

public class Activity51_Rectangle {
    private float width;
    private float height;

    // khoi tao


    public Activity51_Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Activity51_Rectangle() {
    }

    //Getter, Setter
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Tinh chu vi
    public float chuVi() {
        return (width+height)*2;
    }

    // Tinh Dien tich
    public float dienTich() {
        return width*height;
    }

    // In ra width, height
    public void printKichthuoc(){
        System.out.println("Chieu dai la: " + width);
        System.out.println("Chieu rong la:" + height);
    }

    // Kiem tra hinh vuong ?
    public boolean checkHinhVuong() {
        if (width ==  height){
            return true;
        } else {
            return false;
        }
    }
}
