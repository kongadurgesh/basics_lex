package service;

import java.io.IOException;

import entity.Employee;
import exception.EmpSalaryException;

public class EmployeeService {
    public void checkEmployeeSalary(Employee emp) throws EmpSalaryException, Throwable {
        if (emp.getSalary() < 1000) {
            throw new EmpSalaryException(emp.getName() + "'s Salary is less than 1000")
                    .initCause(new IOException("Test Exception Chaining"));
        }
    }
}
