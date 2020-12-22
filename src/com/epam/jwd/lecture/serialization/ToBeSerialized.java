package com.epam.jwd.lecture.serialization;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ToBeSerialized extends CouldNotSerialize implements Serializable {


    private static final long serialVersionUID = 6529663458667398490L;

    private final String name;
    private transient final int age;

    public ToBeSerialized(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ToBeSerialized{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("Hello World");
        out.writeObject(name);
    }
}
