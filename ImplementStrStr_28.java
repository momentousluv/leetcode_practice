package leetcode;

public class ImplementStrStr_28 {
    public static void main(String[] args) {
        ImplementStrStr_28 implementStrStr_28 = new ImplementStrStr_28();
        int resultIndex = implementStrStr_28.strStr("aaaaaa", "a");
        System.out.println("result Index: " + resultIndex);
    }

    public int strStr(String haystack, String needle) {
        int resultIndex = -1;

        if(needle.equals("")) {
            return 0;
        }
        if(!haystack.contains(needle)) {
            return -1;
        }

        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                for(int j = 0; j < needle.length(); j++) {
                    if(haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if(j == needle.length() -1) {
                        resultIndex = i;
                        break;
                    }
                }
            }
            if(resultIndex >= 0) {
                break;
            }
        }

        return resultIndex;
    }
}
