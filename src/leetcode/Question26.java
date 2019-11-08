package leetcode;

/**
 * Created by my on 2019/11/8.
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5,5};
        int size = new Question26().removeDuplicates(nums);
        System.out.println(size);
    }
}
