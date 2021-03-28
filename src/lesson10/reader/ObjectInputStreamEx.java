package lesson10.reader;

import java.io.*;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws Exception{

        // Prepare data
        /*FileOutputStream fileOutputStream = new FileOutputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        User user = new User("Phuc", "20", "phuc@gmail.com");
        objectOutputStream.writeObject(user);
        System.out.println("Write object successfully!");*/

        // đọc sử dụng object input
        FileInputStream fileInputStream = new FileInputStream("E:\\2. Study\\3. Coding\\Java core\\project\\java-core-plus\\output.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User userOut = (User) objectInputStream.readObject();
        System.out.println("User info: " + userOut.getName() + ", " + userOut.getAge()+", " + userOut.getEmail());
    }
}

class User implements Serializable { // Báo hiệu cho lớp này có thể phân rã thành dữ liệu byte
    private String name;
    private String age;
    private String email;

    public User(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}