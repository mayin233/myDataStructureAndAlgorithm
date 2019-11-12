package leetcode;

/**
 * 42题，接雨水
 * Created by my on 2019/11/12.
 */
public class Question42 {

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = new Question42().trap(height);
        System.out.println(res);
    }

    /**
     * 暴力法，先找到最高的墙，然后分别从最左往maxIndex以及从最右往maxIndex计算每一格的水量
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        //1.先找到最高的墙，
        int result = 0;
        int maxIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }

        //2.然后从左边往maxHeight最高的墙之间遍历
        int aHeighSide = 0;
        for (int j = 0; j < maxIndex; j++) {
            if (height[j] > aHeighSide) {
                //设置左边最高的墙
                aHeighSide = height[j];
            } else {
                //计算当前的水量
                result += aHeighSide - height[j];
            }
        }

        // 3. 从右往maxIndex找与之对应的墙，计算墙之间的水
        aHeighSide = 0;
        for (int j = height.length - 1; j > maxIndex; j--) {
            if (height[j] > aHeighSide) {
                //设置右边最高的墙
                aHeighSide = height[j];
            } else {
                //计算当前的水量
                result += aHeighSide - height[j];
            }
        }
        return result;
    }
}
