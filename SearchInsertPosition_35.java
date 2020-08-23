package leetcode;


public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        SearchInsertPosition_35 searchInsertPosition_35 = new SearchInsertPosition_35();
        int[] inputArray = new int[]{1, 3, 5, 6};
        int resultIndex = searchInsertPosition_35.searchInsert(inputArray, 5);
        System.out.println("resultIndex: " + resultIndex);
    }

    public int searchInsert(int[] nums, int target) {
        int resultIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            if(i == 0 && nums[i] > target) {
                return 0;
            }
            if(nums[i] > target && nums[i - 1] < target) {
                return i;
            }
            if(i == nums.length - 1 && nums[i] < target) {
                return nums.length;
            }
        }

        return resultIndex;
    }
}
