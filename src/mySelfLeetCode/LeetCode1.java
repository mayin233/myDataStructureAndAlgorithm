package mySelfLeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * leetCode 第1题 两数之和
 * Created by my on 2019/11/22.
 */
public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = new LeetCode1().twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 暴力法 双重循环
     * @param nums
     * @param target
     * @return
     */
   /* public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }*/


    /**
     * 一遍hash
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //如果target - nums[i]的值在hashmap中有，说明就是要找的两数之和。
            int res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[]{i, map.get(res)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
