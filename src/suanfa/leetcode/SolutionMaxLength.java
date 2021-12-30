package suanfa.leetcode;

import java.util.HashMap;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 12:03 2021/2/9
 * @Modifued By:
 */
public class SolutionMaxLength {
    public static void main(String[] args) {

        int[] arr = {1,5,7,8,5,3,4,2,1};
        int difference = -2;

        int i = longestSubsequence(arr, difference);
        System.out.println(i);
    }

    public static int longestSubsequence(int[] arr, int difference) {
        int[] arrRes = new int[arr.length];
        int  max = 1;
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 1; i < arr.length; i++){
            arrRes[i] = 1;
            if(map.containsKey(arr[i] - difference)){
                arrRes[i] = Math.max(arrRes[i],map.get(arr[i]-difference)+1);
            }
            map.put(arr[i],arrRes[i]);
            max = Math.max(max,arrRes[i]);
        }
        return max;
    }
}