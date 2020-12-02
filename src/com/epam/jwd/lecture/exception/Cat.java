package com.epam.jwd.lecture.exception;

public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayMeow(int amountOfMeows) throws NoSuchMethodException {
        if (amountOfMeows < 0) {
            throw new MeowException("Invalid number of times!!!");
        }
        if (amountOfMeows == 0) {
            throw new NoSuchMethodException("Meow should not be 0");
        }
        for (int i = 0; i < amountOfMeows; i++) {
            System.out.println("Meow");
        }
    }

}
