package io.hackerrank.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private final static String OPERATOR_PATTERN = "[\\-/\\*\\+]";
    private final static String NUMBER_PATTERN = "\\d+";
//5 + 3 / 6 * 2 - 1

    public void calculate(String expression) {
        LinkedList<String> operators = extract(expression, OPERATOR_PATTERN);
        LinkedList<String> numbers = extract(expression, NUMBER_PATTERN);
        while (!operators.isEmpty()) {
            numbers.push(String.valueOf(evaluate(numbers.pop(), operators.pop(), numbers.pop())));
            System.out.println(numbers);
            System.out.println(operators);
        }
        System.out.println(numbers.pop());
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

    public LinkedList<String> extract(String expression, String pattern) {
        Pattern MY_PATTERN = Pattern.compile(pattern);
        Matcher m = MY_PATTERN.matcher(expression);

        LinkedList<String> syllables = new LinkedList<>();
        while (m.find()) {
            syllables.add(m.group());
        }

        return syllables;
    }
}
