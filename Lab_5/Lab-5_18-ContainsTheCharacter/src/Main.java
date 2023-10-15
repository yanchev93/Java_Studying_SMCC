import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
//        Write a program that reads an integer, a list of words, and a character.
//        The integer signifies how many words are in the list.
//        The output of the program is every word in the list that contains the character at least once.
//        For coding simplicity, follow each output word by a comma, even the last one.
//        Add a newline to the end of the last output.
//        Assume at least one word in the list will contain the given character.
//        Assume that the list of words will always contain fewer than 20 words.
//
//        Ex: If the input is:
//        4 hello zoo sleep drizzle z
//        then the output is:
//        zoo,drizzle,

//        To achieve the above, first read the list into an array.
//        Keep in mind that the character 'a' is not equal to the character 'A'.

        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        String[] inputArr = input.split(" ");

        int length = Integer.parseInt(inputArr[0]);
        String containsChar = inputArr[inputArr.length - 1];
        String[] words = new String[length];

        for (int i = 0; i < length; i++) {
            words[i] = inputArr[i + 1];
        }

        for (String word : words) {
            if(word.contains(containsChar)){
                System.out.print(word + ",");
            }
        }
        System.out.println();
    }
}