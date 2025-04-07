package entity;

import exception.EmpSalaryException;
import service.EmployeeService;

public class EmployeeTester {
    public void testEmployee() {
        Employee e1 = new Employee("Joe Smith", 20, 5345);
        Employee e2 = new Employee("Lewis Jane", 21, 1345);
        Employee e3 = new Employee("Larry Page", 22, 245);
        Employee e4 = new Employee("Smith James", 23, 945);
        Employee e5 = new Employee("Elvis George", 25, 1425);
        EmployeeService empService = new EmployeeService();
        Employee[] empArray = { e1, e2, e3, e4, e5 };
        for (Employee employee : empArray) {
            try {
                empService.checkEmployeeSalary(employee);
            } catch (EmpSalaryException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            } catch (Throwable e) {
                System.out.println(e.getCause());
            }
        }
    }
}
