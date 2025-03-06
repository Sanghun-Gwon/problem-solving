package common;

import java.util.Scanner;

/*
leetCode 문제를 관리하는 인터페이스
 */
public interface LeetCodeProblem {
    String getName();
    void execute(Scanner scanner);
    Difficulty getDifficulty();
}
