package lesson10.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterEx {
    public static void main(String[] args) throws  Exception{
        FileWriter fileWriter = new FileWriter("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\output2.txt", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 10);

        bufferedWriter.write("\nTran Phuc\n");
        bufferedWriter.flush(); //  day du lieu tu bo nho dem ra

        bufferedWriter.newLine();
        bufferedWriter.write("Chu Thi Vy");
        bufferedWriter.flush();

        System.out.println("Ghi file thanh cong");
    }
}
