import common.Difficulty;
import common.LeetCodeProblem;
import factory.ProblemFactory;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문제 번호 입력(난이도 보기: list, 종료: exit): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if ("EXIT".equals(input)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if ("LIST".equals(input)) {
                System.out.println("EASY 문제 번호: " + ProblemFactory.getAvailableProblemsByDifficulty(Difficulty.EASY));
                System.out.println("MEDIUM 문제 번호: " + ProblemFactory.getAvailableProblemsByDifficulty(Difficulty.MEDIUM));
                System.out.println("HARD 문제 번호: " + ProblemFactory.getAvailableProblemsByDifficulty(Difficulty.HARD));
                continue;
            }

            LeetCodeProblem problem = ProblemFactory.getProblem(input);

            if (problem == null) {
                System.out.println("유효하지 않은 문제 번호입니다.");
                continue;
            }

            System.out.println("\n" + input + ". " + problem.getName());
            problem.execute(scanner);
        }
    }
}