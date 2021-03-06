package leetcode;

import java.util.Arrays;

/**
 * Created by my on 2019/11/9.
 *  除暴力法外
 * 还可以参考另外2种算法
 * 1. juggling
 * 2. stl rotate

 */
public class Question189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        new Question189().rotate(nums,k);
    }
    /**
     * 1.暴力法，双重循环
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int pre ;
        int temp;
        for(int i=0;i<k;i++){//将数组移动k次
            pre = nums[nums.length-1];//第一次的时候，pre存的是nums中的最后一个数字，最后一个数字会移动到第一个位置
            for(int j = 0 ;j<nums.length;j++){//每次只向后移动一个位置
                temp = nums[j];
                nums[j] = pre ;
                pre = temp;
            }
        }
        for (int num : nums)
        System.out.println(num);
    }

    /**
     * 反转法
     * @param nums
     * @param k
     */
    public  void rotate2(int[] nums,int k){
        // m 是分界点
        int m = k % nums.length;
        // 1.反转整个数组
        reverseArray(nums,0,nums.length-1);

        // 2.反转m之前半部分数组
        reverseArray(nums,0,m-1);
        // 2.反转m往后的部分数组
        reverseArray(nums,m,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverseArray(int[] nums,int start, int end) {
        while(start<end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }


}


