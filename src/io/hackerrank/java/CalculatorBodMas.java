package io.hackerrank.java;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorBodMas {
    private String expression;

    private LinkedList<Double> operands;
    private LinkedList<Character> operators;

    private static final String OPERATORS_PATTERN = "[-/+*]";
    private static final String OPERANDS_PATTERN = "\\d+(\\.\\d+)?";

    public CalculatorBodMas(String expression) {
        this.expression = expression;
        this.operands = new LinkedList<>();
        this.operators = new LinkedList<>();
    }

    public void calculate() {
        extract();

        while (this.operands.size() > 1) {
            int index = BMIndexer();
            double sum = evaluate(operands.remove(index), operands.remove(index),
                    operators.remove(index));

            operands.add(index, sum);
        }

        System.out.println(operands.getFirst());
    }

    private void extract() {
        Pattern operandsPattern = Pattern.compile(OPERANDS_PATTERN);
        Matcher operandsMatcher = operandsPattern.matcher(this.expression);
        while (operandsMatcher.find()) {
            operands.add(Double.parseDouble(operandsMatcher.group()));
        }

        Pattern operatorsPattern = Pattern.compile(OPERATORS_PATTERN);
        Matcher operatorsMatcher = operatorsPattern.matcher(this.expression);
        while (operatorsMatcher.find()) {
            operators.add(operatorsMatcher.group().charAt(0));
        }
    }

    private int BMIndexer() {
        if (this.operators.indexOf('/') > -1) {
            return this.operators.indexOf('/');
        } else if (this.operators.indexOf('*') > -1) {
            return this.operators.indexOf('*');
        } else if (this.operators.indexOf('+') > -1) {
            return this.operators.indexOf('+');
        } else {
            return this.operators.indexOf('-');
        }
    }

    private double evaluate(double first, double second, char operator) {

        switch (operator) {
            case '/':
                return first / second;
            case '*':
                return first * second;
            case '+':
                return first + second;
            case '-':
                return first - second;
        }

        return 0;
    }

    public static void main(String[] args) {
        String expression = "10 + 2 * 10 / 2 - 5 / 5";
        CalculatorBodMas calculatorBodMas = new CalculatorBodMas(expression);
        calculatorBodMas.calculate();
    }


}
