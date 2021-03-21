package lesson9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        /*int[] array = new int[5];
        array[5] = 10;
        System.out.println(array[5]);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen: ");
        int soNguyen = scanner.nextInt();
        System.out.println("So vua nhap la: " + soNguyen);*/

        /*try {
            byte[] file = Files.readAllBytes(new File("E:\\2. Study\\4. Dai Cuong\\KTLT_Vy\\Test\\test.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            Integer a = null;
            int b = 10;
            int c = a / b;

            System.out.println(c);
        } catch (RuntimeException e){
            System.out.println("Co loi xay ra, cu the la: " + e.getMessage());
        }*/ /*catch (ArithmeticException e) {
            System.out.println("Loi toan hoc, cu the la: " + e.getMessage());
        }*/ /*catch (NullPointerException e) {
            System.out.println("Loi bien bang null");
        }*/

        /*finally {
            System.out.println("Day la khoi finally");
        } // du co loi hay khong thi van xay ra*/

        /*List<Integer> arrays= new ArrayList<>();
        int i = 0;
        while (true) {
            arrays.add(1);
            System.out.println(i);
            i++;
        }*/

        System.out.println("Before call phepChia func.");
        try{
            int ret = phepChia(23, 0);

            print();
        } catch (Exception e) {
            System.out.println("Message loi: " + e.getMessage());
        }

        System.out.println("After call phepChia func.");
    }
    private static int phepChia(int a, int b) throws ArithmeticException, NullPointerException {
        System.out.println("phepChia func is being run!");
        //try {
            int x = Integer.parseInt("a23");

            int c = a / b;
            return c; // finally -> return
        /*} catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            throw e;
        } catch (NullPointerException e){
            throw e;
        }
        finally {
            System.out.println("Finally block!");
        }*/
    }
    private static void print() throws Exception {
        // try{
            int a = Integer.valueOf("a23");
            System.out.println(a);
        /*} catch (Exception e) {
            throw e;
        }*/
    }
}
