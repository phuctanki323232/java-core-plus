package lesson6.Example.bank;

public class VCB extends Bank {

    private float vonNhaNuoc = 8.0f;

    public float getVonNhaNuoc() {
        return vonNhaNuoc;
    }

    public void setVonNhaNuoc(float vonNhaNuoc) {
        this.vonNhaNuoc = vonNhaNuoc;
    }

    public float getLaiSuat6Thang(){
        return 6.0f;
    }

    public void show() {
        System.out.println("This is class VCB");
    }

    public VCB(String name, String logo, Float laiSuat, float vonNhaNuoc) {
        super(name, logo, laiSuat); //  gọi hàm khởi tạo của lớp cha từ lớp con
        this.vonNhaNuoc = vonNhaNuoc;
    }

    public VCB(float vonNhaNuoc) {
        this.vonNhaNuoc = vonNhaNuoc;
    }

    /*public static void main(String[] args) {
        VCB vcb = new VCB();
        //vcb.pr... -> khong su dung dc (private)
        vcb.printLaiSuat(); // protected


    }*/

}
