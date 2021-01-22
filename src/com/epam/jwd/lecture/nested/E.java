package com.epam.jwd.lecture.nested;

public class E extends OuterClass.NestedClass {
    @Override
    public void doSomething(OuterClass o) {
        super.helpingDoSomething(o);
    }
}
