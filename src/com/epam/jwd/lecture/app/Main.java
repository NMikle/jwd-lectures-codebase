package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.interpreter.Interpreter;

import java.util.HashMap;
import java.util.Map;

import static com.epam.jwd.lecture.interpreter.Interpreter.parse;

public class Main {

    public static void main(String[] args) {
        Interpreter.Expr expr = parse("w x z - +");
        Map<String, Integer> context = new HashMap<>();
//        Map<String, Integer> context = Map.of("w", 5, "x", 10, "z", 42);
        context.put("w", 5);
        context.put("x", 10);
        context.put("z", 42);
        int result = expr.interpret(context);
        System.out.println(result);        // -27
    }
}
