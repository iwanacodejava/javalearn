package com;

public class Dog {
    private int size;
    private String breed;
    private String name;
    public void bark () {
        System.out.println("Гав! Гав!");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
