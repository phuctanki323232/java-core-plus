package lesson10.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderEx {
    public static void main(String[] args) throws Exception{
        FileReader fileReader = new FileReader("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
