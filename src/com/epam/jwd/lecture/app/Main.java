package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.model.Employee;
import com.epam.jwd.lecture.model.Square;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Set<Square> figures = new HashSet<>();
//        figures.add(new Square("A"));
//        figures.add(new Square("B"));
//        figures.add(new Square("A"));
//
//        for (Square figure : figures) {
//            System.out.println(figure);
//        }
//        ---------------------------------------------------

//        final Set<Color> colors = EnumSet.range(Color.RED, Color.BLUE);
//        for (Color color : colors) {
//            System.out.println(color.name());
//        }
//        ----------------------------------------------------

        Map<String, List<Employee>> employeesByName = new HashMap<>();

        final Employee martin12 = new Employee("Martin", 12);
        final Employee ann13 = new Employee("Ann", 13);
        final Employee martin24 = new Employee("Martin", 24);

        addEmployee(employeesByName, martin12);
        addEmployee(employeesByName, ann13);
        addEmployee(employeesByName, martin24);

//        final List<Employee> martins = employeesByName.get("Martin");
//
//        for (Employee martin : martins) {
//            System.out.println(martin);
//        }
        final Set<String> names = employeesByName.keySet();
        final List<Employee> employees = new ArrayList<>();

        for (List<Employee> employeeList : employeesByName.values()) {
            employees.addAll(employeeList);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        if (employees.size() == 0) {
            //logic
        }

        if (employees.isEmpty()) {

        }

//        final List<Employee> employees = employeesByName.values()
//                .stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());


//        -----------------------------------------------------------

//todo: STREAM API
//        List<Employee> employees = new ArrayList<>();
//        employees.add(martin12);
//        employees.add(ann13);
//        employees.add(martin24);


//        final Map<String, List<Employee>> employeesByName = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getName,
//                        Collectors.mapping(Function.identity(), Collectors.toList())));
//
//        for (Employee martin : employeesByName.get("Martin")) {
//            System.out.println(martin);
//        }
//todo: END OF STREAM API

    }

    private static void addEmployee(Map<String, List<Employee>> employeesByName, Employee employee) {
        final String name = employee.getName();
        if (employeesByName.containsKey(name)) {
            employeesByName.get(name).add(employee);
        } else {
            final List<Employee> martins = new ArrayList<>();
            employeesByName.put(name, martins);
            martins.add(employee);
        }
    }

    private static Set<Square> findAllSquaresWithName(String name) {
        return Collections.emptySet();
    }

}
