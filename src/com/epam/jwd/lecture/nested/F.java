package com.epam.jwd.lecture.nested;

public enum F {
    A("one"),
    B("two") {
        @Override
        public String getStringVariable() {
            return "minus two";
        }
    },
    C("three"),
    D("four");

    private String stringVariable;

    F(String stringVariable) {
        this.stringVariable = stringVariable;
    }

    public String getStringVariable() {
        return stringVariable;
    }
}
