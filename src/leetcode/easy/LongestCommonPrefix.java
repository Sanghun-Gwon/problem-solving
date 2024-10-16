package leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];

        StringBuffer prefix = new StringBuffer();

        for (int i = 0; i < strs.length; i++) {
            char c = strs[0].charAt(i);

            for(String str:strs) {
                if(str.length() <= i || c!=str.charAt(i)) {
                    return prefix.toString();
                }
            }

            prefix.append(c);
        }
        return prefix.toString();
    }
}
