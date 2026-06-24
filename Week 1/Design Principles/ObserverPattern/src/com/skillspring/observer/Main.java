package com.skillspring.observer;

public class Main {

    public static void main(String[] args) {

        StockMarket stock = new StockMarket("TCS");

        Observer mobileUser = new MobileApp("Utkarsh");
        Observer webUser = new WebApp("Admin");

        stock.registerObserver(mobileUser);
        stock.registerObserver(webUser);

        stock.setPrice(3500);

        System.out.println();

        stock.setPrice(3650);
    }
}