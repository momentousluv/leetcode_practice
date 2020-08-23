package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 removeDuplicatesFromSortedArray_26 = new RemoveDuplicatesFromSortedArray_26();
        int[] inputArray = new int[]{1, 1, 2};
        int resultLength = removeDuplicatesFromSortedArray_26.removeDuplicates(inputArray);

        System.out.println("resultInt: " + resultLength);
        for(int i = 0; i < resultLength; i++) {
            System.out.println("inputArray: " + inputArray[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        List<Integer> notDuplicatedList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(!notDuplicatedList.contains(nums[i])) {
                notDuplicatedList.add(nums[i]);
            }
        }
        for(int i = 0; i < notDuplicatedList.size(); i++) {
            nums[i] = notDuplicatedList.get(i);
        }

        return notDuplicatedList.size();
    }
}
