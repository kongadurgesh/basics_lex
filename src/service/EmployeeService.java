package service;

import entity.Employee;
import exception.EmpSalaryException;

public class EmployeeService {
    public void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
        if (emp.getSalary() < 1000) {
            throw new EmpSalaryException(emp.getName() + "'s Salary is less than 1000");
        }
    }
}
