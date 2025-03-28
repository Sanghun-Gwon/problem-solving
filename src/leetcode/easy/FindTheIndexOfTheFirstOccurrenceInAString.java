package leetcode.easy;

import common.Difficulty;
import common.LeetCodeProblem;
import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString implements LeetCodeProblem {

    @Override
    public String getName() {
        return "Find The Index Of The First Occurrence In A String";
    }

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.EASY;
    }

    @Override
    public void execute(Scanner scanner) {


        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the target string: ");
        String t = scanner.nextLine();

        System.out.println("result : " + solution(s, t));

    }

    private int solution(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}
