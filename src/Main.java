import leetcode.easy.LongestCommonPrefix;
import leetcode.easy.MergeTwoSortedLists;
import leetcode.easy.TwoSum;
import leetcode.easy.ValidParentheses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("풀고자 하는 문제(종료 원할시 exit) :");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        while (true) {
            switch (str) {
                case "two sum":
                    System.out.println("1. two sum");
                    TwoSum twoSum = new TwoSum();
                    twoSum.input(scanner);
                    break;
                case "longest common prefix":
                    System.out.println("14. longest common prefix");
                    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
                    longestCommonPrefix.input(scanner);
                    break;
                case "valid parentheses":
                    System.out.println("20. valid parentheses");
                    ValidParentheses validParentheses = new ValidParentheses();
                    String s = scanner.nextLine();
                    System.out.println("result : " + validParentheses.isValid(s));
                    break;
                case "merge two sorted lists":
                    System.out.println("21. merge two sorted lists");
                    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
                    mergeTwoSortedLists.input(scanner);
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
            }
        }
    }
}