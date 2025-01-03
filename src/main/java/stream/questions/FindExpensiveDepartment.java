package stream.questions;

import entity.examples.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindExpensiveDepartment {

    public static void main(String[] args) {
        List<Employee> employees = listOfEmployees();

        Map<String, Double> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("salary " + e.getValue() + " department: " + e.getKey()));

        Map<Integer, Employee> integerEmployeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, e -> e));

        integerEmployeeMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(e -> e.getValue().getSalary()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                )).forEach((k, v) -> System.out.println("id: " + k + " value: " + v.getName() + " salary: " + v.getSalary()));

        Map<Employee, String> employeeStringMap = employees.stream()
                .collect(Collectors.toMap(e -> e, Employee::getName));

        employeeStringMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(e -> e.getKey().getSalary()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new))
                .forEach((k, v) -> System.out.println("key: " + k.getSalary() + " value: " + v));


    }

    private static List<Employee> listOfEmployees() {
        Employee e1 = new Employee(1, "babu", "finance", 20000.45);
        Employee e2 = new Employee(2, "shabby", "electrical", 40000.45);
        Employee e3 = new Employee(3, "hobby", "IT", 67000.45);
        Employee e4 = new Employee(4, "tabby", "IT", 47000.45);
        Employee e5 = new Employee(5, "woo", "finance", 21000.45);

        return List.of(e1, e2, e3, e4, e5);
    }
}
