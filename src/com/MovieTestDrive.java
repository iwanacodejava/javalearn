package com;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to play poker";
        one.genre = "Tragedy";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "In office play";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Bike club";
        three.genre = "Documental";
        three.rating = 127;

    }
}
