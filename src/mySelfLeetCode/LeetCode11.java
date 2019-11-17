package mySelfLeetCode;

/**
 * 盛最多水的容器
 * Created by my on 2019/11/17.
 */
public class LeetCode11 {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = new LeetCode11().maxArea(height);
        System.out.println(maxArea);
    }
    /**
     * 1.暴力法 时间复杂度O(n^2)
     *
     * @param height
     * @return
     */
    /*public int maxArea(int[] height) {

        int maxArea = 0 ;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                //求出i到j的最大面积
                int area = (j-i)*Math.min(height[i],height[j]);
                maxArea = Math.max(area,maxArea);
            }
        }

        return  maxArea;
    }*/

    /**
     * 左右两侧往中间夹逼法，时间复杂度O(n)
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0 ;
        while(i!=j){
            //最高的柱子不动，值移动矮的柱子。然后计算面积，比面积大小
            int minHeight = height[i] < height[j]? height[i++]:height[j--];
            int area = minHeight * (j-i+1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
