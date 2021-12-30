package suanfa.leetcode;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 23:22 2021/2/21
 * @Modifued By:
 */
public class SolutionString {

    public static void main(String[] args) {
        isSubsequence("abc","aAbc");
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for(int j = 0; j < t.length(); j++){
            if(ss[i] == tt[j]) i++;
        }

        if(i == (s.length()-1)){
            return true;
        }
        return false;
    }
}