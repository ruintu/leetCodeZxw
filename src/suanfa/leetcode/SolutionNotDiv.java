package suanfa.leetcode;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 12:22 2021/2/7
 * @Modifued By:
 */
public class SolutionNotDiv {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,2,3};
        SolutionNotDiv solutionNotDiv = new SolutionNotDiv();
        boolean b = solutionNotDiv.checkPossibility(arr);
        System.out.println(b);
    }

    public boolean flg = true;
    public boolean checkPossibility(int[] nums) {
        //找到第一个不满足的位置 然后改变他的值 然后继续循环 看是否是非递减数列
        for(int i = 0; i< nums.length-1; i++){
            if(i >= 1){
                if(nums[i] > nums[i+1]){
                    if(flg && nums[i+1] >= nums[i-1]){
                        nums[i] = nums[i+1];
                        flg = false;
                    }else{
                        return false;
                    }
                }
            }else{
                if(nums[i] > nums[i+1]){
                    if(flg){
                        nums[i] = nums[i+1];
                        flg = false;
                    }else{
                        return false;
                    }
                }
            }

        }
        return true;
    }
}