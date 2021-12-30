package suanfa.leetcode;

import java.util.HashMap;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 14:26 2021/2/8
 * @Modifued By:
 */
public class SolutionmaxScore {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        int res = maxScore(cardPoints,3);
        System.out.println("res:"+res);
    }

    public static int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length, sum = 0;
        for (int cardPoint: cardPoints) {
            sum += cardPoint;
        }

        HashMap<String,Integer> map = new HashMap();
        map.clear();
        int min = Integer.MAX_VALUE, temp = 0;
        int length = len - k;
        for (int i = 0; i < len; i++) {
            temp += cardPoints[i];
            if (i >= length) {
                temp -= cardPoints[i - length];
            }
            if (i >= length - 1)
                min = Math.min(min, temp);
        }
        return sum - min;
    }
}