import java.util.Scanner;

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
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playersNumbers[i] + ", Rating: " + playersRating[i]);
        }

        System.out.println();

        // (2)
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");

        StringBuilder sb = new StringBuilder();

        sb.append("MENU\n");
        sb.append("u - Update player rating\n");
        sb.append("a - Output players above a rating\n");
        sb.append("r - Replace player\n");
        sb.append("o - Output roster\n");
        sb.append("q - Quit\n\n");
        sb.append("Choose an option:");

        System.out.println(sb.toString());

        char option = scnr.next().charAt(0);
        while (option != 'q') {

            if (option == 'u') {

            } else if (option == 'a') {

            } else if (option == 'r') {

            } else if (option == 'o') {

            }

            option = (char) scnr.nextInt();
            System.out.println(sb.toString());
        }
    }
}