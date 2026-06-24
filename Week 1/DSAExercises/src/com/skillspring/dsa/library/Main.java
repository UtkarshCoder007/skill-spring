package com.skillspring.dsa.library;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101,
                        "Clean Code",
                        "Robert Martin"),

                new Book(102,
                        "Design Patterns",
                        "GoF"),

                new Book(103,
                        "Effective Java",
                        "Joshua Bloch"),

                new Book(104,
                        "Head First Java",
                        "Kathy Sierra"),

                new Book(105,
                        "Java Concurrency",
                        "Brian Goetz")
        };

        LibrarySearchService service =
                new LibrarySearchService();

        System.out.println("Linear Search:");

        Book linearResult =
                service.linearSearch(
                        books,
                        "Effective Java");

        System.out.println(linearResult);

        System.out.println("\nBinary Search:");

        Book binaryResult =
                service.binarySearch(
                        books,
                        "Effective Java");

        System.out.println(binaryResult);
    }
}