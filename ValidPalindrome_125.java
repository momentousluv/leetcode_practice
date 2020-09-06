package leetcode;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        ValidPalindrome_125 validPalindrome_125 = new ValidPalindrome_125();
//        boolean isPalindrome = validPalindrome_125.isPalindrome("A man, a plan, a canal: Panama");
//        boolean isPalindrome = validPalindrome_125.isPalindrome("ab_a");
        boolean isPalindrome = validPalindrome_125.isPalindrome("0P");
        System.out.println("isPalindrome: " + isPalindrome);
    }

    public boolean isPalindrome(String s) {
        if(s.length() == 0) {
            return true;
        }
        String tempString = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();

        for(int i = 0; i < tempString.length() / 2; i++) {
            if(tempString.charAt(i) != tempString.charAt(tempString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
