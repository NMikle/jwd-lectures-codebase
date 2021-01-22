package com.epam.jwd.lecture.nested;

public class OuterClass extends ParentClass {

    private String someField = "initial string";
    private InnerClass innerObject = new InnerClass() {
        @Override
        public String someAbstractMethod() {
            return null;
        }
    };

    public abstract class InnerClass extends AnotherParentClass implements SomeInterface {

        private String innerField;
        private final static String staticField = "";

        public void changeOuterField(String newValue) {
            someField = newValue;
            System.out.println(newValue);
        }

        @Override
        public final int coolMethod() {
            return 42;
        }

        public abstract String someAbstractMethod();

        public final class AnotherInnerClass extends InnerClass {

            @Override
            public String someAbstractMethod() {
                return "Hey from abstract method implementation";
            }
        }

    }

    public void changeInnerField(String newValue) {
        final InnerClass i = innerObject.new AnotherInnerClass();
        i.innerField = newValue;
    }
}
