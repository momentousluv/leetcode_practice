package leetcode;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        MergeSortedArray_88 mergeSortedArray_88 = new MergeSortedArray_88();

        int[] inputArray1 = new int[]{1};
        int[] inputArray2 = new int[]{};
        mergeSortedArray_88.merge(inputArray1,1, inputArray2, 0);
        for (int value : inputArray1) {
            System.out.println("inputArray1: " + value);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArray = new int[m + n];

        this.mergeArray(nums1, m, nums2, n, mergeArray);
        this.copyArray(mergeArray, nums1);
    }

    private void mergeArray(int[] nums1, int m, int[] nums2, int n , int[] mergeArray) {
        int i = 0;
        int j = 0;
        int mergeHead = 0;

        while(i < m || j < n) {
            if(n == j) {
                mergeArray[mergeHead] = nums1[i];
                mergeHead += 1;
                i += 1;
            }
            else if(m == i) {
                mergeArray[mergeHead] = nums2[j];
                mergeHead += 1;
                j += 1;
            }
            else if(nums1[i] >= nums2[j] || i >= m) {
                System.out.println("if nums1[i]: " + nums1[i] + ", i: " + i + ", nums2[j]: " + nums2[j] + ", j: " + j);
                mergeArray[mergeHead] = nums2[j];
                mergeHead += 1;
                j += 1;
            }
            else if(nums2[j] > nums1[i] || j >= n) {
                System.out.println("else if nums1[i]: " + nums1[i] + ", i: " + i + ", nums2[j]: " + nums2[j] + ", j: " + j);
                mergeArray[mergeHead] = nums1[i];
                mergeHead += 1;
                i += 1;
            }
        }
    }

    private void copyArray(int[] source, int[] target) {
        for(int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }
}
