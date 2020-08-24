package leetcode;

public class PlusOne_66 {
    public static void main(String[] args) {
        PlusOne_66 plusOne_66 = new PlusOne_66();
        int[] inputArray = new int[]{1, 2, 3};
        int[] resultIntArray =  plusOne_66.plusOne(inputArray);

        for(int resultInt : resultIntArray) {
            System.out.println("resultIntArray: " + resultInt);
        }
    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;

        return this.createNewArray(digits, length);
    }

    private int[] createNewArray(int[] inputArray, int length) {
        int nineStopPosition = this.checkNineStopPosition(inputArray, length);
        int[] newArray = this.createOnlyArrayByPosition(nineStopPosition, length);

        int j = 0;
        if(nineStopPosition == 0) {
            newArray[j] = 1;
            j += 1;
        } else {
            newArray[nineStopPosition - 1] += 1;
        }

        for(int i = 0; i < nineStopPosition; i++) {
            newArray[j] += inputArray[i];
            j += 1;
        }
        return newArray;
    }

    private int checkNineStopPosition(int[] inputArray, int length) {
        int position = length;

        for(int i= length -1 ; i >= 0; i--) {
            if(inputArray[i] != 9) {
                break;
            }
            position -= 1;
        }
        return position;
    }

    private int[] createOnlyArrayByPosition(int nineStopPosition, int length) {
        if(nineStopPosition == 0) {
            return new int[length + 1];
        }
        else {
            return new int[length];
        }
    }
}
