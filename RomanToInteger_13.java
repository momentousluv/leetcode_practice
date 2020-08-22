package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        RomanToInteger_13 romanToInteger_13 = new RomanToInteger_13();
        int resultInteger = romanToInteger_13.romanToInt("MCMXCIV");
        System.out.println("resultInteger: " + resultInteger);
    }

    private Map<String, Integer> romanMap = new HashMap<>();

    public int romanToInt(String s) {
        int resultInt = 0;
        initRomanMap();
        Stack stack = new Stack();
        System.out.println("s.length: " + s.length());

        for(int i = 0; i < s.length(); i++) {
            int romanToInteger = romanMap.get(String.valueOf(s.charAt(i)));
            int beforeStackValue = stack.search(stack.getHead());

            if(romanToInteger > beforeStackValue) {
                int stackValue = stack.pop();
                stack.push(romanToInteger - stackValue);
            } else {
                stack.push(romanToInteger);
            }
        }

        System.out.println("stackList size: " + stack.getStackList().size());
        for(int integer : stack.getStackList()) {
            System.out.println("integer: " + integer);
            resultInt += integer;
        }
        System.out.println("resultInt: " + resultInt);

        return resultInt;
    }

    private void initRomanMap() {
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
    }

    class Stack {
        private List<Integer> stackList;

        Stack() {
            stackList = new ArrayList<>();
        }

        public int pop() {
            if(this.stackList.size() <= 0) {
                return 0;
            }
            int popValue = this.stackList.get(stackList.size() - 1);
            this.stackList.remove(stackList.size() - 1);
            return popValue;
        }

        public void push(int pushValue) {
            this.stackList.add(pushValue);
        }

        public int search(int index) {
            if(this.stackList.size() <= 0 ) {
                return 0;
            }
            return this.stackList.get(index);
        }

        public int getHead() {
            if(this.stackList.size() <= 0) {
                return 0;
            }
            return this.stackList.size() - 1;
        }

        public List<Integer> getStackList() {
            return this.stackList;
        }
    }
}
