package com.skillspring.dsa.sorting;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "John", 2500),
                new Order(102, "Alice", 1000),
                new Order(103, "Bob", 5000),
                new Order(104, "David", 3000)
        };

        SortingService service = new SortingService();

        System.out.println("Original Orders:");
        service.displayOrders(orders);

        service.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        service.displayOrders(orders);

        Order[] quickOrders = {
                new Order(101, "John", 2500),
                new Order(102, "Alice", 1000),
                new Order(103, "Bob", 5000),
                new Order(104, "David", 3000)
        };

        service.quickSort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        service.displayOrders(quickOrders);
    }
}