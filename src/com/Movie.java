package com;

public class Movie {
    private String title;
    private String genre;
    private int rating;
    public void playIt() {
        System.out.println("Проигрывание фильма");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
