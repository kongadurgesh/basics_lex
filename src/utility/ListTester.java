package utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import entity.Employee;

public class ListTester {
    public void testList() {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("A", 1, 1));
        employees.add(new Employee("B", 2, 1));
        employees.add(new Employee("C", 3, 1));

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next().getName());
        }

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public void listTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        ListIterator<String> iterator = names.listIterator(names.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
