package mySelfLeetCode;

import java.util.*;

/**
 * leetCode 第15题 三数之和
 * Created by my on 2019/11/22.
 */
public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        for (List<Integer> r: res ) {
            System.out.println(Arrays.toString(r.toArray()));
        }

    }
    /**
     * 暴力法
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        // [-1, 0, 1, 2, -1, -4]

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        List list = new ArrayList<List<Integer>>();
        list.addAll(result);
        return  list;
    }

}
