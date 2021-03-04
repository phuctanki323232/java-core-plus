/*Viết lớp Test cho phép người dùng:
        - Nhập vào danh sách từ điển (Prepare data for testing)
        - Cho phép tra cứu nghĩa của từ: yêu cầu ng dùng nhập vào type và key
        - In ra thống kê của chương trình từ điển (bao nhiêu từ AV, bao nhiêu từ VA)*/

package lesson5.Activity53;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong tu: ");
        int numOfWord = scanner.nextInt();
        scanner.nextLine();

        Word[] words = new Word[numOfWord];

        for (int i = 0; i < numOfWord; i++) {
            System.out.print("\nKey: ");
            String key = scanner.nextLine();
            System.out.print("Value: ");
            String value = scanner.nextLine();
            System.out.print("Type: ");
            String type = scanner.nextLine();

            words[i] = new Word(key, value, type);
        }

        // look up
        System.out.println("\n\nLet's Look up!\n");
        System.out.print("Word: ");
        String keyWord = scanner.nextLine();
        System.out.print("Type: ");
        String typeWord = scanner.nextLine();

        Dictionary dictionary = new Dictionary(words);
        System.out.println("\nMeaning: " + dictionary.find(keyWord, typeWord));

        // thong ke
        System.out.println("\nAbout this dictionary:\n");
        System.out.println("Number of Eng-Viet words: " + dictionary.numOFEVWord());
        System.out.print("Number of Viet-Eng words: " + dictionary.numOfVEWord());

    }
}
