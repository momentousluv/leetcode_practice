package leetcode;

import java.util.List;

public class RemoveElement_27 {
    public static void main(String[] args) {
        RemoveElement_27 removeElement_27 = new RemoveElement_27();
//        int[] inputArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] inputArray = new int[]{3, 2, 2, 3};
        int resultLength = removeElement_27.removeElement(inputArray, 3);

        System.out.println("resultLength: " + resultLength);
        for(int i = 0; i < resultLength; i++) {
            System.out.println("result value: " + inputArray[i]);
        }
    }

    public int removeElement(int[] nums, int val) {
        int length = 0;
        int head = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                System.out.println("nums[i] != val : " + nums[i] + ", i: " + i + ", length: " + length);
                nums[head] = nums[i];
                length += 1;
                head += 1;
            }
        }

        return length;
    }
}
