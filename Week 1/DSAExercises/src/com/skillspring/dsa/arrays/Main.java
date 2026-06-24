package com.skillspring.dsa.arrays;

public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem(10);

        system.addEmployee(
                new Employee(101, "John", "Developer", 75000));

        system.addEmployee(
                new Employee(102, "Alice", "Tester", 65000));

        system.addEmployee(
                new Employee(103, "Bob", "Manager", 95000));

        System.out.println("\nAll Employees:");
        system.displayEmployees();

        System.out.println("\nSearch Employee 102:");
        System.out.println(system.searchEmployee(102));

        system.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        system.displayEmployees();
    }
}