import common.LeetCodeProblem;
import factory.ProblemFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n사용 가능한 문제 번호: " +
                ProblemFactory.getAvailableProblems());

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("풀고자 하는 문제 번호 입력(종료: exit): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("프로그램을 종료합니다.");
                break;
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