package leetcode.easy;

import common.Difficulty;
import common.LeetCodeProblem;
import java.util.Scanner;

public class LongestCommonPrefix implements LeetCodeProblem {

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

        System.out.print("입력할 숫자의 갯수 :");
        int n = scanner.nextInt();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            strs[i] = scanner.next();
        }

        System.out.println("result : " + longestCommonPrefix(strs));
    }

    private String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for(String str:strs) {
                if(str.length() <= i || c!=str.charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }
        return sb.toString();
    }
}
