package factory;

import common.LeetCodeProblem;
import leetcode.easy.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class ProblemFactory {
    private static final Map<String, Supplier<LeetCodeProblem>> PROBLEM_MAP = new HashMap<>();

    static {
        // Easy 문제들
        PROBLEM_MAP.put("1", TwoSum::new);
        PROBLEM_MAP.put("20", ValidParentheses::new);

        // Medium 문제들도 추가 가능
        // PROBLEM_MAP.put("3", LongestSubstringWithoutRepeatingCharacters::new);

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

    public static Set<String> getAvailableProblems() {
        return PROBLEM_MAP.keySet();
    }
}
