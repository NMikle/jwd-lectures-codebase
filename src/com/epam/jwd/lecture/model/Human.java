package com.epam.jwd.lecture.model;

public interface Human {
    int a = 4;

    Long getAge();

    String getName();

    Integer getHeight();

    Integer getWeight();

    String sayHello();

    String sayHello(String name);

    void setAge(Long age);
}
