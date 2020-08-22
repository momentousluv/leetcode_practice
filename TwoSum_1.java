package leetcode;

public class TwoSum_1 {
    public static void main(String[] args) {
        TwoSum_1 twoSum1 = new TwoSum_1();
        int[] resultTwoElement = twoSum1.twoSum(new int[]{-3, 4, 3, 90}, 0);
        System.out.println("result first: " + resultTwoElement[0] + ", result second: " + resultTwoElement[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] twoElement = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                System.out.println("i: " + nums[i] + ", j: " + nums[j]);
                if(nums[i] + nums[j] == target) {
                    twoElement[0] = i;
                    twoElement[1] = j;
                    break;
                }
            }
        }

        return twoElement;
    }
}
