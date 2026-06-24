package com.skillspring.dsa.searching;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Monitor", "Electronics"),
                new Product(104, "Mouse", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        SearchService searchService = new SearchService();

        System.out.println("Linear Search:");

        Product linearResult =
                searchService.linearSearch(products, "Mouse");

        System.out.println(linearResult);

        System.out.println("\nBinary Search:");

        Product binaryResult =
                searchService.binarySearch(products, "Mouse");

        System.out.println(binaryResult);
    }
}