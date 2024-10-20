package leetcode.easy;

import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public void input(Scanner scanner) {

        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the target string: ");
        String t = scanner.nextLine();

        solution(s, t);
    }
    public int solution(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}
