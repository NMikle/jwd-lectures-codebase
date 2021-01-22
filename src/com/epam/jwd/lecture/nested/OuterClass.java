package com.epam.jwd.lecture.nested;

public class OuterClass extends ParentClass {

    private String someField = "initial string";
    private static String someStaticField = "initial static string";

    public abstract static class NestedClass extends ParentClass implements SomeInterface {

        public void helpingDoSomething(OuterClass o) {
            o.nonStaticHello();
            o.someField = "a";
        }

        public void methodWithoutOuterClassObject() {
            hello();
            OuterClass.someStaticField = "anotherValue";
        }

        public static int nestedStaticMethod() {
            hello();
            return 42;
        }

        public static class AnotherNestedClass extends NestedClass {
            @Override
            public void doSomething(OuterClass o) {
                o.someField = "a";
            }
        }

    }

    public static void hello() {
        //do something
    }

    public void nonStaticHello() {
        //do something
    }

    public enum SomeEnumeration {

    }

}
