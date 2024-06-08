package stream.questions;

import entity.examples.Employee;

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
