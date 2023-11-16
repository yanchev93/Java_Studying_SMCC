import java.util.Scanner;
public class Main {
    public static String intToBinaryStr(int intValue) {
        String binaryValue = "";
        while (intValue > 0) {
          if (intValue % 2 == 0) {
              binaryValue = binaryValue + "0"; }
          else {
          binaryValue = binaryValue + "1"; }
        intValue = intValue / 2; }
  return reverseString(binaryValue); }
  public static String reverseString(String inputString) {
        String reverseInput = "";
        for (int i = inputString.length()-1; i >= 0; --i) {
        reverseInput = reverseInput + inputString.charAt(i); }
        return reverseInput; }
  public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();
        System.out.println(intToBinaryStr(userInput)); }
}

//import java.util.Scanner;
//public class ConvertToBinary {
//  public static String intToBinaryStr(int intValue) {
//        String binaryValue = "";
//        while (intValue > 0) {
//          if (intValue % 2 == 0) {
//              binaryValue = binaryValue + "0"; }
//          else {
//          binaryValue = binaryValue + "1"; }
//        intValue = intValue / 2; }
//  return reverseString(binaryValue); }
//  public static String reverseString(String inputString) {
//        String reverseInput = "";
//        for (int i = inputString.length()-1; i >= 0; --i) {
//        reverseInput = reverseInput + inputString.charAt(i); }
//        return reverseInput; }
//  public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        int userInput = scnr.nextInt();
//        System.out.println(intToBinaryStr(userInput)); }
//}

