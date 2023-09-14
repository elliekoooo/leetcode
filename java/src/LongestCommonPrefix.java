import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];
        int p = 0;

        while(p < first.length() && p < last.length()){
            if(first.charAt(p) == last.charAt(p)) p++;
            else break;
        }

        return first.substring(0, p);
    }
}
