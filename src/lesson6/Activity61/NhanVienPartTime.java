package lesson6.Activity61;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;

    public NhanVienPartTime(String name, int age, String sex, int soGioLam) {
        super(name, age, sex);
        this.soGioLam = soGioLam;
    }


    public int tinhLuong() {
        return 100000 * soGioLam;
    }
}
