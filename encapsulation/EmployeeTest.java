package com.training.encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee("krupa");
        Employee employee2 = new Employee(12, "krupa");





        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Name: " + employee.getId());

        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Name: " + employee1.getId());

        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Employee Name: " + employee2.getId());


    }

}
