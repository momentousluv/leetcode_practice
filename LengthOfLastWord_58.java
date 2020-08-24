package leetcode;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        LengthOfLastWord_58 lengthOfLastWord_58 = new LengthOfLastWord_58();
        int resultLength = lengthOfLastWord_58.lengthOfLastWord(" ");
        System.out.println("resultLength: " + resultLength);
    }

    public int lengthOfLastWord(String s) {
        if(s.trim().length() == 0) {
            return 0;
        }

        String lastWord = s.split(" ")[s.split(" ").length - 1];

        return lastWord.length();
    }
}
