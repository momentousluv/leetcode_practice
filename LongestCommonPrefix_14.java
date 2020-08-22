package leetcode;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        LongestCommonPrefix_14 longestCommonPrefix_14 = new LongestCommonPrefix_14();
        String[] stringArray = new String[]{""};
        String resultString = longestCommonPrefix_14.longestCommonPrefix(stringArray);
        System.out.println("resultString: " + resultString);
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        int smallestLength = Integer.MAX_VALUE;
        StringBuilder resultString = new StringBuilder();

        for (String str : strs) {
            if (smallestLength > str.length()) {
                smallestLength = str.length();
            }
        }
        for(int i = 0; i < smallestLength; i++) {
            boolean tempBoolean = true;
            for(int j = 1; j < strs.length; j++) {
                if(strs[0].charAt(i) != strs[j].charAt(i)) {
                    tempBoolean = false;
                    break;
                }
            }
            if(!tempBoolean) {
                break;
            }
            resultString.append(strs[0].charAt(i));
        }

        return resultString.toString();
    }
}
