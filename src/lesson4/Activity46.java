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

    private static void getSandwich(String sandwich) {
        int firstPiece, lastPiece;
        firstPiece = sandwich.indexOf("bread");
        lastPiece = sandwich.lastIndexOf("bread");
        if (lastPiece == firstPiece) {
            System.out.println();
        } else {
            String mid = sandwich.substring(firstPiece + 5, lastPiece);
            System.out.println(mid);
        }
    }
}
