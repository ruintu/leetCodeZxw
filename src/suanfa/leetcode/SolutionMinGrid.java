package suanfa.leetcode;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 16:03 2021/2/9
 * @Modifued By:
 */
public class SolutionMinGrid {
    public static void main(String[] args) {


        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int a = minPathSum(grid);
        System.out.println(a);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n ;j++){
                int max1=Integer.MAX_VALUE;
                int max2=Integer.MAX_VALUE;
                if(i == 0 && j == 0)
                {
                    dp[i][j] = grid[i][j];
                    continue;
                }

                if(i-1>=0) max1 = grid[i][j] + dp[i-1][j];
                if(j-1>=0) max2 = grid[i][j] + dp[i][j-1];

                dp[i][j] = Math.min(max1,max2);
            }
        }
        return dp[m-1][n-1];
    }
}