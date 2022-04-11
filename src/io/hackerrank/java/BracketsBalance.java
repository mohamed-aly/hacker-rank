package io.hackerrank.java;

import java.util.Scanner;
import java.util.Stack;

public class BracketsBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println(isBalanced(sc.next()));
        }

        sc.close();

    }

    private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

