package leetcode;

public class AddBinary_67 {
    public static void main(String[] args) {
        AddBinary_67 addBinary_67 = new AddBinary_67();
        String resultString = addBinary_67.addBinary("1010", "1011");
        System.out.println("resultString: " + resultString);
    }

    public String addBinary(String a, String b) {
        if(a.equals("0") && b.equals("0")) {
            return "0";
        }
        return this.sumBinaryString(a, b);

//        int aDigit = this.convertToDigit(a);
//        int bDigit = this.convertToDigit(b);
//        int resultDigit = aDigit + bDigit;
//        return this.convertToBinary(resultDigit);
    }

    private String sumBinaryString(String a, String b) {
        String longBinaryString = this.getLongestString(a, b);
        String shortBinaryString = this.getShortestString(a, b);
        StringBuilder sumBinaryString = new StringBuilder();
        int upperScore = 0;
        int lengthInterval = longBinaryString.length() - shortBinaryString.length();

        for(int i = shortBinaryString.length() - 1; i >= 0; i--) {
            int sumResult = Integer.parseInt(String.valueOf(shortBinaryString.charAt(i))) +
                    Integer.parseInt(String.valueOf(longBinaryString.charAt(i + lengthInterval))) + upperScore;
            int restSum = sumResult % 2;
            upperScore = sumResult / 2;
            sumBinaryString.insert(0, restSum);
        }
        for(int i = longBinaryString.length() - shortBinaryString.length() - 1; i >= 0; i--) {
            int sumResult = Integer.parseInt(String.valueOf(longBinaryString.charAt(i))) + upperScore;
            int restSum = sumResult % 2;
            upperScore = sumResult / 2;
            sumBinaryString.insert(0, restSum);

        }
        if(upperScore > 0) {
            sumBinaryString.insert(0, upperScore);
        }

        return sumBinaryString.toString();
    }

    private String getLongestString(String a, String b) {
        return a.length() >= b.length() ? a : b;
    }

    private String getShortestString(String a, String b) {
        return a.length() < b.length() ? a: b;
    }

//    private int convertToDigit(String binaryString) {
//        int digit = 0;
//        int length = binaryString.length();
//        int binaryInt = Integer.parseInt(binaryString);
//
//        for(int i = 0; i < length; i++) {
//            digit += (binaryInt % 10 * (Math.pow(2, i)));
//            binaryInt = binaryInt / 10;
//        }
//        return digit;
//    }
//
//    private String convertToBinary(int digit) {
//        StringBuilder binary = new StringBuilder();
//
//        while(digit > 0) {
//            binary.insert(0, digit % 2);
//            digit = digit / 2;
//        }
//
//        return binary.toString();
//    }
}
