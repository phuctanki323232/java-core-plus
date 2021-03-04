package lesson6.Activity61;

public class NhanVienFullTime extends NhanVien{

    private String type;
    private int soNgayLamThem;

    public NhanVienFullTime(String name, int age, String sex, String type, int soNgayLamThem) {
        super(name, age, sex);
        this.type = type;
        this.soNgayLamThem = soNgayLamThem;
    }

    public int tinhLuong() {
        int luong = 0;
        if (type.equals("SEP")) {
            luong = 20000000;
        }
        if (type.equals("LINH")){
            luong = 10000000;
        }
        return luong + soNgayLamThem * 800000;
    }
}
