/*Viết lớp Dictionary gồm:
        Thuộc tính:
        Word[]: mảng các từ điển

        Phương thức:
        - Tìm kiếm nghĩa của từ theo key và type
        - Đếm số lượng từ vựng VA
        - Đếm số lượng từ vựng AV
        Constructor*/

package lesson5.Activity53;

public class Dictionary {
    private Word[] words;

    // Tìm kiếm nghĩa của từ theo key và type
    public String find(String keyWord, String typeWord) {
        for (Word word : words) {
            if (word.getKey().equals(keyWord) && word.getType().equals(typeWord)) {
                return word.getValue();
            }
        }
        return "Khong tra cuu duoc!";
    }

    public int numOfVEWord() {
        int count = 0;
        for (Word word : words) {
            if (word.getType().equals("VE")) {
                count++;
            }
        }
        return count;
    }

    public int numOFEVWord() {
        int count = 0;
        for (Word word : words) {
            if (word.getType().equals("EV")) {
                count++;
            }
        }
        return count;
    }

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
    }
}
