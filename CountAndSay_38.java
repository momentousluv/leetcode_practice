package leetcode;

public class CountAndSay_38 {
    public static void main(String[] args) {
        CountAndSay_38 countAndSay_38 = new CountAndSay_38();
        String resultString = countAndSay_38.countAndSay(4);
        System.out.println("resultString: " + resultString);
    }

    //TODO. retry later.
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        String tempString = this.countAndSay(n - 1);
        StringBuilder resultString = new StringBuilder();
        int count = 0;
        int value = 0;

        for(int i = 0; i < tempString.length(); i++) {
            if(i > 0 && tempString.charAt(i) == tempString.charAt(i - 1)) {
                count += 1;
            }
            else if(i > 0 && tempString.charAt(i) != tempString.charAt(i - 1)) {
                resultString.append(count).append(value);
                count = 1;
                value = Integer.parseInt(String.valueOf(tempString.charAt(i)));
            }
            else {
                count += 1;
                value = Integer.parseInt(String.valueOf(tempString.charAt(i)));
            }
        }
        resultString.append(count).append(value);

        return resultString.toString();
    }
}
// 1
// 11
// 21
// 1211
// 111221