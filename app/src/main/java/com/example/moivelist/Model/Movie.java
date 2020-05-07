package com.example.moivelist.Model;

public class Movie {

    private  String title , category, year ;
    int image ;

    public Movie() {
    }

    public Movie(String title, String category, String year , int image) {
        this.title = title;
        this.category = category;
        this.year = year;
        this.image= image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
