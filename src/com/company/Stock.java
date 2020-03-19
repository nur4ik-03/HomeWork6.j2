package com.company;

public interface Stock {

    public class Pantry<N extends Number> implements Printable<N> {

        N pantry;

        public Pantry(N pantry) {
            this.pantry = pantry;
        }

        public N getPantry() {
            return pantry;
        }


        @Override
        public N printPrice() {
            System.out.println(pantry);
            return pantry;
        }
    }

    }

