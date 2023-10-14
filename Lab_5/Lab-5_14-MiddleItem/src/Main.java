import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Given a sorted list of integers, output the middle integer.
//        A negative number indicates the end of the input (the negative number is not a part of the sorted list).
//        Assume the number of integers is always odd.
//
//        Ex: If the input is:
//        2 3 4 8 11 -1
//        the output is:
//
//        Middle item: 4
//        The maximum number of list values for any test case should not exceed 9.
//        If exceeded, output "Too many numbers".
//
//        Hint: First read the data into an array. Then, based on the array's size, find the middle item.
        Scanner scnr = new Scanner(System.in);
        int[] numArr = new int[9];
        int count = 0;
        int currNum = scnr.nextInt();

        while (currNum >= 0 && count < 9) {
            numArr[count] = currNum;
            count += 1;
            currNum = scnr.nextInt();
        }

        if (currNum >= 0 && count == 9) {
            System.out.println("Too many numbers");
        } else {
            int middleInt = count / 2;
            System.out.println("Middle item: " + numArr[middleInt]);
        }
    }
}