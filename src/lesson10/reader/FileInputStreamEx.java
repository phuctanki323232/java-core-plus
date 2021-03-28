package lesson10.reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {

        /*FileInputStream fileInputStream = new FileInputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\test_image.png");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.println((char)i);
        }*/

        // copy file anh
        /*FileOutputStream fileOutputStream = new FileOutputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\output.png");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
        }
        System.out.println("Da copy file thanh cong");*/

        //copy file txt
        /*FileInputStream fileInputStream = new FileInputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\input.txt");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) { // i != -1 -> van con du lieu
            System.out.print((char) i);
        }
        fileInputStream.close();*/

        // tăng tốc độ đọc ghi tốt hơn
        FileInputStream fileInputStream = new FileInputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\input.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 10);

        int i = 0;
        while ((i = fileInputStream.read()) != -1) { // i != -1 -> van con du lieu
            System.out.print((char) i);
        }
        fileInputStream.close();
        bufferedInputStream.close();
    }
}
