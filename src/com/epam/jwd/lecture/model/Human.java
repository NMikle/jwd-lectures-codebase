package com.epam.jwd.lecture.model;

public interface Human {
    Long getAge();
    String getName();
    Integer getHeight();
    Integer getWeight();
    String sayHello();
    String sayHello(String name);
    void setAge(Long age);
}
