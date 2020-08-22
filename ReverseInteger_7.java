package leetcode;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        ReverseInteger_7 reverseInteger_7 = new ReverseInteger_7();
        int result = reverseInteger_7.reverse(-2147483412);
//        int result = reverseInteger_7.reverse(-10);

        System.out.println("result: " + result);
    }

    public int reverse(int x) {
        if(x == 0) {
            return 0;
        }
        StringBuilder reverseIntegerString = new StringBuilder();
        String intString = Integer.toString(x);

        for(int i = intString.length() - 1; i >= 0; i--) {
            if(i == intString.length() - 1 && Integer.parseInt(String.valueOf(intString.charAt(i))) == 0) {
                continue;
            }
            else if(String.valueOf(intString.charAt(i)).equals("-")) {
                reverseIntegerString.insert(0, intString.charAt(i));
            } else {
                reverseIntegerString.append(intString.charAt(i));
            }
        }

        if((reverseIntegerString.toString().compareTo(Integer.toString(Integer.MAX_VALUE)) > 0 && reverseIntegerString.toString().length() >= Integer.toString(Integer.MAX_VALUE).length()) ||
                (reverseIntegerString.toString().compareTo(Integer.toString(Integer.MIN_VALUE)) > 0 && reverseIntegerString.toString().length() >= Integer.toString(Integer.MIN_VALUE).length())
        ) {
            return 0;
        }

        return Integer.parseInt(reverseIntegerString.toString());
    }
}
