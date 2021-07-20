package com;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.setTitle("How to play poker");
        one.setGenre("Tragedy");
        one.setRating(-2);
        Movie two = new Movie();
        two.setTitle("In office play");
        two.setGenre("Comedy");
        two.setRating(5);
        two.playIt();
        Movie three = new Movie();
        three.setTitle("Bike club");
        three.setGenre("Documental");
        three.setRating(127);

    }
}
