package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        ValidParentheses_20 validParentheses_20 = new ValidParentheses_20();
        boolean isValid = validParentheses_20.isValid("[");
        System.out.println("isValid: " + isValid);
    }

    private Map<Character, Character> parenthesesMap = new HashMap<>();

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack stack = new Stack();
        initParenthesesMap();

        for(int i = 0; i < s.length(); i++) {
            char beforeStackValue = stack.search(stack.getHead());

            System.out.println("beforeStackValue: " + beforeStackValue + ", mapValue:" + this.parenthesesMap.get(s.charAt(i)));
            if(beforeStackValue == this.parenthesesMap.get(s.charAt(i))) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }

        return stack.getHead() <= 0;
    }

    private void initParenthesesMap() {
        this.parenthesesMap.put('{', '}');
        this.parenthesesMap.put('}', '{');

        this.parenthesesMap.put('[', ']');
        this.parenthesesMap.put(']', '[');

        this.parenthesesMap.put('(', ')');
        this.parenthesesMap.put(')', '(');
    }

    class Stack {
        private List<Character> stackList;

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

        public void push(char pushValue) {
            this.stackList.add(pushValue);
        }

        public char search(int index) {
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

        public List<Character> getStackList() {
            return this.stackList;
        }
    }
}
