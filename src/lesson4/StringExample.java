package lesson4;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {

        String chuoi = "Hello";

        /*int length = chuoi.length();

        char[] character = chuoi.toCharArray();
        for (char ch : character){
            System.out.print(ch);
        }
         int size = character.length;

        boolean result = length == size;
        System.out.println(result);*/

        // xử lý chuỗi
        chuoi = chuoi.concat(" Java");// cộng gộp lại sau chuỗi
        //chuoi = chuoi + " Java";
        System.out.println(chuoi);

        char a = chuoi.charAt(1); // kí tự ở vị trí
        System.out.println(a);

        boolean result = chuoi.endsWith("o"); // có kết thúc bởi chuỗi ?
        System.out.println(result);

        boolean result2 = chuoi.startsWith("H");// có bắt đầu bởi..?
        System.out.println(result2);

        boolean result3 = chuoi.equals("Hello"); // có giống chuỗi?
        System.out.println(result3);

        boolean result4 = chuoi.equalsIgnoreCase("hello"); //so sán bỏ qua chữ hoa, thường
        System.out.println(result4);

        byte[] bytes = chuoi.getBytes(); // chuyển chuỗi => byte (ASCII)
        for (byte i : bytes){
            System.out.println(i);
        }

        int result5 = chuoi.indexOf("ell"); // vị trí đầu tiên bắt đầu tìm thấy chuỗi
        System.out.println(result5);

        int result6 = chuoi.lastIndexOf("l"); // vị trí cuối tìm thấy ký tự
        System.out.println(result6);

        String chuoi1 = "phuctanki@gmail.com";
        boolean result7 = chuoi1.matches(".*@.*.com"); // tìm hiểu thêm  về bt chính quy
        System.out.println(result7);

        chuoi = chuoi.replace("ll", "LL");
        System.out.println(chuoi);

        chuoi = chuoi.substring(2); // cắt chuỗi từ vị trí
        chuoi = chuoi.substring(2,4); // cắt chuỗi từ vị trí đến vt - 1

        String[] array = chuoi.split("e");
        for (String item : array){
            System.out.println(item);
        }

        chuoi = chuoi.toLowerCase();
        chuoi = chuoi.toUpperCase();

        String chuoi2 = "      Hello   ";
        chuoi = chuoi.trim(); // xoá hết dấu cách 2 đầu chuỗi

        boolean result8 = chuoi.contains(""); // kiểm tra chuỗi có chứa...?

        boolean result9 = chuoi.isEmpty();
    }
}
