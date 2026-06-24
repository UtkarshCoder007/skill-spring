package com.skillspring.dsa.linkedlist;

public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(
                new Task(101, "Design Database", "Pending"));

        taskList.addTask(
                new Task(102, "Develop API", "In Progress"));

        taskList.addTask(
                new Task(103, "Write Tests", "Pending"));

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearch Task 102:");
        System.out.println(taskList.searchTask(102));

        taskList.deleteTask(102);

        System.out.println("\nAfter Deletion:");
        taskList.displayTasks();
    }
}