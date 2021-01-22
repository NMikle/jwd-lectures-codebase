package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.nested.OuterClass;

public class Main {

    public static void main(String[] args) {
        final OuterClass outerObject = new OuterClass();
        final OuterClass.InnerClass innerObject = outerObject. new InnerClass() {
            @Override
            public String someAbstractMethod() {
                return null;
            }
        };

        final OuterClass.InnerClass.AnotherInnerClass anotherInnerObject = innerObject.new AnotherInnerClass();

        innerObject.changeOuterField("new string");
    }
}
