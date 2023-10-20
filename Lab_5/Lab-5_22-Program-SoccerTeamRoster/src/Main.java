import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int arrLength = 5;
        int[] playersNumbers = new int[arrLength];
        int[] playersRating = new int[arrLength];

        // (1)
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter player " + (i + 1) + "'s jersey number:");
            int currentPlayerNumber = scnr.nextInt();
            //if (0 <= currentPlayerNumber && currentPlayerNumber <= 99){
            playersNumbers[i] = currentPlayerNumber;
            //}

            System.out.println("Enter player " + (i + 1) + "'s rating:");
            int currentPlayerRating = scnr.nextInt();
            //if (1 <= currentPlayerRating && currentPlayerRating <= 9) {
            playersRating[i] = currentPlayerRating;
            //}
            System.out.println();
        }

        System.out.println("ROSTER");

        outputRoster(arrLength, playersNumbers, playersRating);

        System.out.println();

        // (2)
        StringBuilder sb = new StringBuilder();

        sb.append("MENU\n");
        sb.append("u - Update player rating\n");
        sb.append("a - Output players above a rating\n");
        sb.append("r - Replace player\n");
        sb.append("o - Output roster\n");
        sb.append("q - Quit\n\n");
        sb.append("Choose an option:\n");

        System.out.println(sb.toString());

        char option = scnr.next().charAt(0);
        while (option != 'q') {
            // (4)
            if (option == 'u') {
                //System.out.println("Enter a jersey number:");
                int updatePlayer = scnr.nextInt();
                int indexOfPlayerRating = Arrays.binarySearch(playersNumbers, updatePlayer);

                //System.out.println("Enter a new rating for player:");
                int newPlayerRating = scnr.nextInt();
                playersRating[indexOfPlayerRating] = newPlayerRating;
            } else if (option == 'a') {

            } else if (option == 'r') {
            // (3)
            } else if (option == 'o') {
                outputRoster(arrLength,playersNumbers,playersRating);
            }

            option = scnr.next().charAt(0);
            // System.out.println(sb.toString());
        }
    }

    private static void outputRoster(int arrLength, int[] playersNumbers, int[] playersRating) {
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playersNumbers[i] + ", Rating: " + playersRating[i]);
        }
    }
}