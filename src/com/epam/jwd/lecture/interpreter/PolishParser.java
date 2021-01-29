package com.epam.jwd.lecture.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PolishParser {

    public static void main(String[] args) { //todo: not working correctly
        final String input = "3 + 4 × 2 ÷ ( 1 − 5 ) ^ 2 ^ 3";
        System.out.println(Arrays.toString(infixToRPN(input.split(" "))));
    }

    public static String[] infixToRPN(String[] inputTokens) {
        List<String> out = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        // For each tokens
        for (String token : inputTokens) {
            // If token is an operator
            if (isOperator(token)) {
                // While stack not empty AND stack top element
                // is an operator
                while (!stack.empty() && isOperator(stack.peek())) {
                    if ((leftAssociative(token) &&
                            cmpPrecedence(token, stack.peek()) <= 0) ||
                            (rightAssociative(token) &&
                                    cmpPrecedence(token, stack.peek()) < 0)) {
                        out.add(stack.pop());
                        continue;
                    }
                    break;
                }
                // Push the new operator on the stack
                stack.push(token);
            }
            // If token is a left bracket '('
            else if (token.equals("(")) {
                stack.push(token);  //
            }
            // If token is a right bracket ')'
            else if (token.equals(")")) {
                while (!stack.empty() && !stack.peek().equals("(")) {
                    out.add(stack.pop());
                }
                stack.pop();
            }
            // If token is a number
            else {
                out.add(token);
            }
        }
        while (!stack.empty()) {
            out.add(stack.pop());
        }
        String[] output = new String[out.size()];
        return out.toArray(output);
    }

    private static boolean leftAssociative(String token) {
        return isOperator(token) && '^' != token.charAt(0);
    }

    private static boolean rightAssociative(String token) {
        return isOperator(token) && !leftAssociative(token);
    }

    private static int cmpPrecedence(String token, String peek) {
        final int firstPrecedence = precedence(token.charAt(0));
        final int secondPrecedence = precedence(peek.charAt(0));
        return Integer.compare(firstPrecedence, secondPrecedence);
    }

    private static boolean isOperator(String token) {
        return token.matches("[+−*÷^]");

    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '÷':
                return 3;
            case '^':
                return 4;
//            case '(':
//            case ')':
//                return 0;
            default:
                throw new IllegalStateException(String.format("%s is not an operator", operator));
        }
    }

}
