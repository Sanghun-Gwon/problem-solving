import leetcode.easy.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("풀고자 하는 문제(종료 원할시 exit) : ");


        while (true) {
            String str = scanner.nextLine();

            switch (str) {
                case "1":
                    System.out.println("1. two sum");
                    TwoSum twoSum = new TwoSum();
                    twoSum.input(scanner);
                    break;
                case "14":
                    System.out.println("14. longest common prefix");
                    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
                    longestCommonPrefix.input(scanner);
                    break;
                case "20":
                    System.out.println("20. valid parentheses");
                    ValidParentheses validParentheses = new ValidParentheses();
                    String s = scanner.nextLine();
                    System.out.println("result : " + validParentheses.isValid(s));
                    break;
                case "21":
                    System.out.println("21. merge two sorted lists");
                    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
                    mergeTwoSortedLists.input(scanner);
                    break;
                case "26":
                    System.out.println("26. remove duplicates");
                    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
                    removeDuplicatesFromSortedArray.input(scanner);
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
            }
        }
    }
}