package com.skillspring.dsa.linkedlist;

public class TaskLinkedList {

    private TaskNode head;

    // Add Task
    public void addTask(Task task) {

        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
            return;
        }

        TaskNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Search Task
    public Task searchTask(int taskId) {

        TaskNode current = head;

        while (current != null) {

            if (current.task.getTaskId() == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    // Traverse Tasks
    public void displayTasks() {

        TaskNode current = head;

        while (current != null) {

            System.out.println(current.task);

            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        TaskNode current = head;

        while (current.next != null &&
                current.next.task.getTaskId() != taskId) {

            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}