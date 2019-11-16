package mySelfLeetCode;

import java.util.Arrays;

/**
 * leetcode 283 移动零
 * Created by my on 2019/11/16.
 */
public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,5,6};
//        int[] nums = {1,0,1,2,0,5,6};
        new LeetCode283().moveZeros(nums);
    }
    public void moveZeros(int[] nums) {
        //j存放非0元素的下标
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
