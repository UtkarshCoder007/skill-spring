package com.skillspring.dsa.arrays;

public class EmployeeManagementSystem {

    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (size == employees.length) {
            System.out.println("Employee array is full.");
            return;
        }

        employees[size] = employee;
        size++;

        System.out.println("Employee added successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int employeeId) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee deleted successfully.");
    }
}