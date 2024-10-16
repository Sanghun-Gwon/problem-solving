package leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
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
