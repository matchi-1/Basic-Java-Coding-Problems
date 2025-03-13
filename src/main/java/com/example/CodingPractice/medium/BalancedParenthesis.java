package com.example.CodingPractice.medium;
import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    // No matching opening parenthesis
                    return false;
                }
                stack.pop();
            }
            System.out.println(stack.toString());
        }
        // If stack is empty, all parentheses were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String parenthesis = ")())";
        System.out.println(isBalanced(parenthesis)); // Output: false
    }
}
