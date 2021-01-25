package com.epam.jwd.lecture.nested;

public interface SomeInterface {

    void doSomething(OuterClass o);

    default void someDefaultMethod() {
        SubClass s = new SubClass();
        final InnerEnum blue = InnerEnum.BLUE;
    }

    static void someStaticMethod() {
        SubClass s = new SubClass();
        final InnerEnum blue = InnerEnum.BLUE;
    }

    class SubClass {

    }

    enum InnerEnum {
        BLUE;
    }

}
