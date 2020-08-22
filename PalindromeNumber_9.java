package leetcode;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        PalindromeNumber_9 palindromeNumber_9 = new PalindromeNumber_9();
        boolean isPalindromeAble = palindromeNumber_9.isPalindrome(10);

        System.out.println("isPalindromeAble: " + isPalindromeAble);
    }

    public boolean isPalindrome(int x) {
        String intString = Integer.toString(x);
        if(intString.charAt(0) == '-') {
            return false;
        }
        boolean isPalindromeAble = true;

        for(int i = 0; i < intString.length()/2; i++) {
            if(i >= intString.length() -1 - i) {
                break;
            }
            if(intString.charAt(i) != intString.charAt(intString.length() - 1 - i)) {
                isPalindromeAble = false;
                break;
            }
        }

        return isPalindromeAble;
    }
}
