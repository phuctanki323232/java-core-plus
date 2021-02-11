package lesson4;

public class ArrayExample2 {
    public static void main(String[] args) {

        // khởi tạo
        int[][] array = new int[][]{{4, 5}, {2, 4}, {6, 7}};
        int[][] array2 = new int[3][4]; // 3x4: hang x cot

        // 4 5
        // 2 4
        // 6 7

        // gán giá trị
        int a = array[2][1];
        System.out.println(a);

        // duyệt
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// oop
class Diem {
    private int toan;
    private int ly;
    private int van;
}