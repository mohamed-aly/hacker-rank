package io.hackerrank.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public void calculate(String expression) {

        LinkedList<String> syllables = extract(expression);
        while (syllables.size() > 1) {
            syllables.push(String.valueOf(evaluate(syllables.pop(), syllables.pop(), syllables.pop())));

        }
        System.out.println(syllables.pop());
    }

    private double evaluate(String first, String operator, String second) {
        double x = Double.parseDouble(first);
        double y = Double.parseDouble(second);

        switch (operator) {
            case "/":
                return x / y;

            case "*":
                return x * y;

            case "+":
                return x + y;

            case "-":
                return x - y;

            default:
                throw new IllegalArgumentException();
        }
    }

    public LinkedList<String> extract(String expression) {
        Pattern MY_PATTERN = Pattern.compile("\\d+|[-*/+]");
        Matcher m = MY_PATTERN.matcher(expression);

        LinkedList<String> syllables = new LinkedList<>();
        while (m.find()) {
            syllables.add(m.group());
        }

        return syllables;
    }
}
