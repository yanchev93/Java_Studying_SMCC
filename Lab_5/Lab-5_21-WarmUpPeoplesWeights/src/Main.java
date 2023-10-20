import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        (1) Prompt the user to enter five numbers, being five people's weights.
//        Store the numbers in an array of doubles.
//        Output the array's numbers on one line, each number followed by one space. (2 pts)
//
//        Ex:
//        Enter weight 1:
//        236.0
//        Enter weight 2:
//        89.5
//        Enter weight 3:
//        142.0
//        Enter weight 4:
//        166.3
//        Enter weight 5:
//        93.0
//        You entered: 236.0 89.5 142.0 166.3 93.0

//        (2) Also output the total weight, by summing the array's elements. (1 pt)
//        (3) Also output the average of the array's elements. (1 pt)
//        (4) Also output the max array element. (2 pts)

//        Ex:
//        Enter weight 1:
//        236.0
//        Enter weight 2:
//        89.5
//        Enter weight 3:
//        142.0
//        Enter weight 4:
//        166.3
//        Enter weight 5:
//        93.0
//        You entered: 236.0 89.5 142.0 166.3 93.0
//
//        Total weight: 726.8
//        Average weight: 145.35999999999999
//        Max weight: 236.0

        Scanner scanner = new Scanner(System.in);

        // Create an array to store weights
        double[] weights = new double[5];

        // Prompt user for input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter weight " + (i + 1) + ":");
            weights[i] = scanner.nextDouble();
        }

        // Output the entered weights
        System.out.print("You entered: ");
        for (double weight : weights) {
            System.out.print(weight + " ");
        }
        System.out.println();
        System.out.println();

        double totalWeight = Arrays.stream(weights).sum();
        double avgWeight = Arrays.stream(weights).sum() / weights.length;
        Arrays.sort(weights);
        double maxWeight = weights[weights.length - 1];

        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + avgWeight);
        System.out.println("Max weight: " + maxWeight);

//        236
//        89.5
//        142
//        166.3
//        93
    }
}