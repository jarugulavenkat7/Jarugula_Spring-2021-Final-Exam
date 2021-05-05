/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class EmployeeDriver {

    public static void main(String[] args) {
        
              
        System.out.println("Question:12 By Venkat Sai Jarugula");
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(103, "Ravi Kiran", 5000));
        employeeList.add(new Employee(105, "Gowtham", 4500));
        employeeList.add(new Employee(104, "Subash", 6000));
        employeeList.add(new Employee(101, "Sai Kumar", 3500));
        employeeList.add(new Employee(102, "Venkat Sai", 4000));
        System.out.println("******* Original Employee list *******");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
        Collections.sort(employeeList);
        System.out.println("******* Employee list by its natural order (empId number) *******");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary()) == 0) {
                    return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
                } else {
                    return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
                }
            }
        });
        System.out.println("******* Employee list sorted by empSalary *******");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (emp1.getEmpName().compareTo(emp2.getEmpName()) == 0) {
                    return emp1.getEmpName().compareTo(emp2.getEmpName());
                } else {
                    return emp1.getEmpName().compareTo(emp2.getEmpName());
                }
            }
        });
        System.out.println("******* Employee list sorted by empName *******");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}
