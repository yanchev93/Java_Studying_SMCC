/**
 * @author vgreen
 */

import java.util.Scanner;

public class Main {

    /**
     * Given any integer, find its position in the base provided.
     *
     * @param num         any integer
     * @param maxNumInSet maximum value in a set.  Low value is assumed to be 0.
     * @return a number resulting from modular arithmetic using num % maxNumInSet.
     */
    public static int findInSet(int num, int maxNumInSet) {
        int result = num;
        num %= maxNumInSet;
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type an integer.");
        int userNum = in.nextInt();
        final int DAYS_IN_WEEK = 7;

        System.out.println("Let's assume that \"Sunday\" is a 0.");
        System.out.println("Your number's position in the week is: ");

        findInSet(DAYS_IN_WEEK, userNum);

    }
}
