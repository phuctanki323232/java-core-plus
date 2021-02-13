/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and
last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""*/

package lesson4;

import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sandwich = scanner.nextLine();

        getSandwich(sandwich);
    }

    private static String daochuoi (String mid) {
        int length = mid.length();
        char[] characters = mid.toCharArray();
        char[] characters2 = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            characters2[length - 1 - i] = characters[i];
        }
        mid = new String(characters2);
        return mid;
    }

    private static void getSandwich(String sandwich) {
        int firstPiece = 0, lastPiece = 0;
        firstPiece = sandwich.indexOf("bread");
        lastPiece = sandwich.lastIndexOf("bread");
        if (lastPiece == 0 || lastPiece == firstPiece) {
            System.out.println("");
        } else {
            String mid = sandwich.substring(firstPiece, lastPiece);
            mid = daochuoi(mid);
            int firstPiece2 = mid.indexOf("daerb");
            mid = mid.substring(0, firstPiece2);
            mid = daochuoi(mid);
            System.out.println(mid);
        }
    }
}
