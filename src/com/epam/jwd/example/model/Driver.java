package com.epam.jwd.example.model;

public class Driver implements Human {

    private Long age;
    private String name;
    private Integer height;
    private Integer weight;
    private byte amountOfWorkedYears;

    public Driver(Long age) {
        this.age = age;
    }

    public Driver(Long age, String name, Integer height, Integer weight, byte amountOfWorkedYears) {
        this.amountOfWorkedYears = amountOfWorkedYears;
    }

    @Override
    public String sayHello() {
        return "I am driver";
    }

    @Override
    public String sayHello(String name) {
        return "I am driver with name: " + name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public byte getAmountOfWorkedYears() {
        return amountOfWorkedYears;
    }

    public void setAmountOfWorkedYears(byte amountOfWorkedYears) {
        this.amountOfWorkedYears = amountOfWorkedYears;
    }

    int anotherMethod() {
        return 5;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", amountOfWorkedYears=" + amountOfWorkedYears +
                '}';
    }
}
