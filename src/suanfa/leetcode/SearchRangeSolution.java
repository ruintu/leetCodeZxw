package suanfa.leetcode;

import java.util.HashMap;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 22:56 2021/2/22
 * @Modifued By:
 */
public class SearchRangeSolution {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ints = searchRange(arr, target);
        System.out.println("int0"+ints[0]);

    }


    public static int[] searchRange(int[] nums, int target) {

        int t1 = searchLeft(nums,target);
        System.out.println("t1"+t1);
        int t2 = searchRight(nums,target);
        System.out.println("t2"+t2);
        int[] arr = new int[2];
        arr[0] = t1;
        arr[1] = t2;
        return arr;
    }

    public static int searchLeft(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] == target){
                right = mid-1;
            }
        }

        if(left >= nums.length || nums[left] != target) return -1;
        return left;
    }

    public static int searchRight(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] == target){
                left = mid+1;
            }
        }

        if(right < 0 || nums[right] != target) return -1;
        return right;

    }
}