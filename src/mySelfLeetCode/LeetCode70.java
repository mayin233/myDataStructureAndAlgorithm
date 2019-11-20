package mySelfLeetCode;

/**
 * leetcode 第70题，爬楼梯，一次只能爬1级楼梯或2级楼梯，求N级楼梯有多少种爬法
 * Created by my on 2019/11/20.
 */
public class LeetCode70 {
    public static void main(String[] args) {
        int res = new LeetCode70().climbStairs(3);
        System.out.println(res);
    }

    /**
     * 递归解法 ，会超时
     * @param n
     * @return
     */
    /*public int climbStairs(int n) {
        int[] nums = new int[n+1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if(nums[n]>0){
            return nums[n];
        }

        nums[n] = climbStairs(n-1)+climbStairs(n-2);
        return  nums[n];

    }*/

    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


}
