package lesson10;

import java.io.*;
import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) throws IOException {

        // check file co ton tai ?
        System.out.println("Ex1");

        String pathName1 = "E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\input2.txt";
        if (checkExist(pathName1)) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist!");
        }

        // get specific file
        System.out.println("\nEx2");

        String pathName2 = "E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus";
        String endName = ".txt";
        System.out.println("All file ends with " + endName);
        getSpecificFile(pathName2, endName);

         // find the longest word
        System.out.println("\nEx3");

        String pathName3 = "E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\input.txt";
        System.out.println("The longest word: " + longestWordInFile(pathName3));
    }

    public static boolean checkExist(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    public static void getSpecificFile(String pathFile, String endFile) {
        File file = new File(pathFile);

        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(endFile);
            }
        });

        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    public static String longestWordInFile(String pathFile) throws IOException {

        String longestWord = "";
        String word;

        Scanner file = new Scanner(new File(pathFile));

        while (file.hasNext()){
            word = file.next();

            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }
}