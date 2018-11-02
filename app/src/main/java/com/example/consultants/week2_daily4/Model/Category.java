package com.example.consultants.week2_daily4.Model;

public class Category {
    String Category;

    @Override
    public String toString() {
        return "Category{" +
                "Category='" + Category + '\'' +
                '}';
    }

//  constructor
    public Category(String category) {

        Category = category;
    }

//    Getter and Setter
    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }


}
