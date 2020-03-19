package com.company;

public class Main {

    public static void main(String[] args) {

        Stock.Pantry<Integer> numBox = new Stock.Pantry<>(22);
        Stock.Pantry<Double> nameBox = new Stock.Pantry<>(23.2);

        numBox.printPrice();
        nameBox.printPrice();
    }
}