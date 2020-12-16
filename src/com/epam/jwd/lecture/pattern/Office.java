package com.epam.jwd.lecture.pattern;

import com.epam.jwd.lecture.model.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Office {

    private final BigDecimal area;
    private final int amountOfSeats;
    private final int amountOfTakenSeats;
    private final int amountOfEntrances;
    private final List<Employee> employees;
    private final byte amountOfWindows;

    private Office(BigDecimal area, int amountOfSeats, int amountOfTakenSeats, int amountOfEntrances, List<Employee> employees, byte amountOfWindows) {
        this.area = area;
        this.amountOfSeats = amountOfSeats;
        this.amountOfTakenSeats = amountOfTakenSeats;
        this.amountOfEntrances = amountOfEntrances;
        this.employees = employees;
        this.amountOfWindows = amountOfWindows;
    }

    public BigDecimal getArea() {
        return area;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public int getAmountOfTakenSeats() {
        return amountOfTakenSeats;
    }

    public int getAmountOfEntrances() {
        return amountOfEntrances;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public byte getAmountOfWindows() {
        return amountOfWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Office)) return false;

        Office office = (Office) o;

        if (amountOfSeats != office.amountOfSeats) return false;
        if (amountOfTakenSeats != office.amountOfTakenSeats) return false;
        if (amountOfEntrances != office.amountOfEntrances) return false;
        if (amountOfWindows != office.amountOfWindows) return false;
        if (!Objects.equals(area, office.area)) return false;
        return Objects.equals(employees, office.employees);
    }

    @Override
    public int hashCode() {
        int result = area != null ? area.hashCode() : 0;
        result = 31 * result + amountOfSeats;
        result = 31 * result + amountOfTakenSeats;
        result = 31 * result + amountOfEntrances;
        result = 31 * result + (employees != null ? employees.hashCode() : 0);
        result = 31 * result + (int) amountOfWindows;
        return result;
    }

    @Override
    public String toString() {
        return "Office{" +
                "area=" + area +
                ", amountOfSeats=" + amountOfSeats +
                ", amountOfTakenSeats=" + amountOfTakenSeats +
                ", amountOfEntrances=" + amountOfEntrances +
                ", employees=" + employees +
                ", amountOfWindows=" + amountOfWindows +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private BigDecimal area;
        private int amountOfSeats;
        private int amountOfTakenSeats;
        private int amountOfEntrances;
        private List<Employee> employees;
        private byte amountOfWindows;


        public Builder area(BigDecimal area) {
            this.area = area;
            return this;
        }

        public Builder amountOfSeats(int amountOfSeats) {
            this.amountOfSeats = amountOfSeats;
            return this;
        }

        public Builder amountOfTakenSeats(int amountOfTakenSeats) {
            this.amountOfTakenSeats = amountOfTakenSeats;
            return this;
        }

        public Builder amountOfEntrances(int amountOfEntrances) {
            this.amountOfEntrances = amountOfEntrances;
            return this;
        }

        public Builder employees(List<Employee> employees) {
            this.employees = employees;
            return this;
        }

        public Builder amountOfWindows(byte amountOfWindows) {
            this.amountOfWindows = amountOfWindows;
            return this;
        }

        public Office build() {
            return new Office(this.area,
                    this.amountOfSeats,
                    this.amountOfTakenSeats,
                    this.amountOfEntrances,
                    this.employees,
                    this.amountOfWindows);
        }
    }
}
