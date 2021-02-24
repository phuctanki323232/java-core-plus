/*Viết lớp Word gồm:
        Thuộc tính:
        key: từ trong từ điển
        value: Nghĩa của từ
        type: Loại từ điển (AV-Anh Việt hoặc VA-Việt Anh)
        Phương thức:
        - Getter/Setter
        Constructor*/

package lesson5;

public class Word {
    private String key;
    private String value;
    private String type; // AV or VA

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Word(String key, String value, String type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public Word() {
    }
}
