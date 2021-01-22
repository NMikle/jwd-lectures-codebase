package com.epam.jwd.lecture.clone;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ToBeCloned implements Cloneable {
    private String stringField;
    private int intField;
    private List<String> mutableField;
    private Vector<String> anotherMutable;

    public ToBeCloned(String stringField, int intField, List<String> mutableField, Vector<String> anotherMutable) {
        this.stringField = stringField;
        this.intField = intField;
        this.mutableField = mutableField;
        this.anotherMutable = anotherMutable;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void setMutableField(List<String> mutableField) {
        this.mutableField = mutableField;
    }

    public Vector<String> getAnotherMutable() {
        return anotherMutable;
    }

    public void setAnotherMutable(Vector<String> anotherMutable) {
        this.anotherMutable = anotherMutable;
    }

    @Override
    public ToBeCloned clone() {
        ToBeCloned copy;
        try {
            copy = (ToBeCloned) super.clone();
            copy.mutableField = new ArrayList<>(copy.mutableField);
            copy.anotherMutable = (Vector<String>) copy.anotherMutable.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
        return copy;
    }

    @Override
    public String toString() {
        return "ToBeCloned{" +
                "stringField='" + stringField + '\'' +
                ", intField=" + intField +
                ", mutableField=" + mutableField +
                '}';
    }
}
