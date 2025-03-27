package factory;

import common.Difficulty;
import common.LeetCodeProblem;
import java.util.Optional;
import java.util.stream.Collectors;
import leetcode.easy.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import leetcode.medium.ReverseInteger;

public class ProblemFactory {
    private static final Map<String, Supplier<LeetCodeProblem>> PROBLEM_MAP = new HashMap<>();

    static {
        // Easy 문제들
        PROBLEM_MAP.put("1", TwoSum::new);
        PROBLEM_MAP.put("20", ValidParentheses::new);

        // Medium 문제들도 추가 가능
        PROBLEM_MAP.put("3", ReverseInteger::new);

        // Hard 문제들도 추가 가능
        // PROBLEM_MAP.put("4", MedianOfTwoSortedArrays::new);
    }

    public static LeetCodeProblem getProblem(String problemNumber) {
        Supplier<LeetCodeProblem> supplier = PROBLEM_MAP.get(problemNumber);
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static Set<String> getAvailableProblemsByDifficulty(Difficulty difficulty) {
        return PROBLEM_MAP.entrySet().stream()
            .filter(stringSupplierEntry -> difficulty.equals(stringSupplierEntry.getValue().get().getDifficulty()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
    }

    public static Set<String> getAvailableProblems() {
        return PROBLEM_MAP.keySet();
    }
}
