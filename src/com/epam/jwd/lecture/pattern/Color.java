package com.epam.jwd.lecture.pattern;

public enum Color {
    RED(1, false),
    GREEN(2, false),
    BLUE(87, true),
    ORANGE(12, true);

    private final int age;
    private final boolean isOld;

    Color(int age, boolean isOld) {
        this.age = age;
        this.isOld = isOld;
    }

    public int getAge() {
        return age;
    }

    public boolean isOld() {
        return isOld;
    }
}
