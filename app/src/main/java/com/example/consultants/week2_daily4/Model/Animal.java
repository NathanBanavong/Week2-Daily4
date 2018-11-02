package com.example.consultants.week2_daily4.Model;

public class Animal {
    String name;
    String category;
    String weight;
    String sound;
    String description;
    String Image;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", weight='" + weight + '\'' +
                ", sound='" + sound + '\'' +
                ", description='" + description + '\'' +
                ", Image='" + Image + '\'' +
                '}';
    }



    //    getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSound(){
        return sound;
    }
     public void setSound() {
        this.sound = description;
     }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }


    //    animal that only passes category
    public Animal(String category) {
        this.category = category;
    }

    //    constructor
    public Animal(String name, String category, String weight, String sound, String Image, String description) {

        this.name = name;
        this.category = category;
        this.weight = weight;
        this.sound = sound;
        this.description = description;
        this.Image = Image;
    }

}
