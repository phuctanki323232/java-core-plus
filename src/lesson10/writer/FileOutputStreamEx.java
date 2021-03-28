package lesson10.writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\test.mp4");

        FileOutputStream fileOutputStream = new FileOutputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\out-test.mp4");

        long start = System.currentTimeMillis();
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
        }
        System.out.println("Time use FileInputStream = " + (System.currentTimeMillis() - start));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 1000);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1000);

        long start2 = System.currentTimeMillis();
        while ((i = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(i);
        }
        System.out.println("Time use buffer = " + (System.currentTimeMillis() - start2));
        System.out.println("Ghi file thanh cong");
    }
}
