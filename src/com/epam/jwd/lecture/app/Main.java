package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.nested.E;
import com.epam.jwd.lecture.nested.OuterClass;
import com.epam.jwd.lecture.nested.OuterClass.NestedClass;
import com.epam.jwd.lecture.nested.OuterClass.NestedClass.AnotherNestedClass;
import com.epam.jwd.lecture.nested.SomeInterface;

import static com.epam.jwd.lecture.nested.OuterClass.NestedClass.nestedStaticMethod;

public class Main {

    public static void main(String[] args) {
        final NestedClass objectOfNestedType1 = new AnotherNestedClass();
        final NestedClass objectOfNestedType2 = new E();
        final NestedClass objectOfNestedType3 = new NestedClass() {

            @Override
            public void doSomething(OuterClass o) {
                new E() {

                };
            }
        };
        final int globalAnswer = nestedStaticMethod();
        final SomeInterface.InnerEnum colorType = SomeInterface.InnerEnum.BLUE;
    }
}
