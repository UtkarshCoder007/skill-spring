package com.skillspring.builder;

public class Main {

    public static void main(String[] args) {

        Computer gamingPc = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16 GB")
                .setStorage("1 TB SSD")
                .build();

        Computer officePc = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8 GB")
                .setStorage("512 GB SSD")
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPc.displayConfiguration();

        System.out.println("Office PC Configuration:");
        officePc.displayConfiguration();
    }
}