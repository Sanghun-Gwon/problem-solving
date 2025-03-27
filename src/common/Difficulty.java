package common;

import java.util.Arrays;

//난이도 관리(추후 유틸클래스로 뺼수도)
public enum Difficulty {
    EASY("EASY"),
    MEDIUM("MEDIUM"),
    HARD("HARD");


    private String code;

    Difficulty(String code){
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public static Difficulty getDifficulty(String code) {
        return Arrays.stream(Difficulty.values())
            .filter(responseCode -> responseCode.getCode().equals(code))
            .findFirst()
            .orElse(null);
    }
}
