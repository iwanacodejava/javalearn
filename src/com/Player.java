package com;

public class Player {
    private int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
