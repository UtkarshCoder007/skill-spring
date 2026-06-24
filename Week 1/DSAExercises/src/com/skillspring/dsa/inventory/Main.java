package com.skillspring.dsa.inventory;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 65000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 25, 1500);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory:");
        manager.displayInventory();

        manager.updateProduct(101, 15, 70000);

        System.out.println("\nAfter Update:");
        manager.displayInventory();

        System.out.println("\nSearching Product 102:");
        System.out.println(manager.searchProduct(102));

        manager.deleteProduct(103);

        System.out.println("\nAfter Deletion:");
        manager.displayInventory();
    }
}