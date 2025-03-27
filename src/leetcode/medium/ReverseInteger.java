package leetcode.medium;


import common.Difficulty;
import common.LeetCodeProblem;
import java.util.Scanner;

public class ReverseInteger implements LeetCodeProblem {
    @Override
    public String getName() {
        return "Reverse Integer";
    }

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.MEDIUM;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("result : " + this.reverse(scanner.nextInt()));
    }

    public int reverse(int x) {
        String revStr = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(revStr) * -1 : Integer.parseInt(revStr);
        } catch(NumberFormatException e) {
            return 0;
        }
    }
}
