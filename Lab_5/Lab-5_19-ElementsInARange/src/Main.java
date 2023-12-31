import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Write a program that first gets a list of integers from input.
//        The input begins with an integer indicating the number of integers that follow.
//        Assume that the list will always contain fewer than 20 integers.
//        That list is followed by two more integers representing lower and upper bounds of a range.
//        Your program should output all integers from the list that are within that range (inclusive of the bounds).
//        For coding simplicity, follow each output integer by a comma, even the last one.
//        The output ends with a newline.
//
//        Ex: If the input is:
//        5 25 51 0 200 33
//        0 50

//        then the output is:
//        25,0,33,
//        (the bounds are 0-50, so 51 and 200 are out of range and thus not output).
//
//        To achieve the above, first read the list of integers into an array

        Scanner scnr = new Scanner(System.in);

        int[] firstInput = Arrays.stream(scnr.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondInput = Arrays.stream(scnr.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = firstInput[0];

        for (int i = 0; i < length; i++) {
            if (secondInput[0] <= firstInput[i + 1] && firstInput[i + 1] <= secondInput[1]) {
                System.out.print(firstInput[i + 1] + ",");
            }
        }
        System.out.println();
    }
}

