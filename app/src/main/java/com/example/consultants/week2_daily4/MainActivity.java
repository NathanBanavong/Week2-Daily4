package com.example.consultants.week2_daily4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.consultants.week2_daily4.Database.AnimalDatabase;
import com.example.consultants.week2_daily4.Model.Animal;
import com.example.consultants.week2_daily4.View.CategoryListViewActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

//    private AnimalDatabase animalDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreateDB(View view) {
        AnimalDatabase animalDB;
        animalDB = new AnimalDatabase(getApplicationContext());
        List<Animal> animalList;
        animalList = populateDatabase();
        animalDB.saveAnimal(animalList);
    }

//    public Animal(String name, String category, String weight, String sound, String Image, String description) {

    public List<Animal> populateDatabase() {
        List<Animal> animalsdb = new ArrayList<>();

        //        mammals
        Animal animal_1 = new Animal("Polar Bear", "Mammal", "1200", "Sound", "Image", "a carnivorous creature whose native range lies largely within the Arctic Circle");
        animalsdb.add(animal_1);
        Animal animal_2 = new Animal("Monkey", "Mammal", "152", "Sound", "Image", "This is a monkey");
        animalsdb.add(animal_2);
        Animal animal_3 = new Animal("Giraffe", "Mammal", "152", "Sound", "Image", "This is a Giraffe");
        animalsdb.add(animal_3);

        //       birds
        Animal animal_4 = new Animal("Parrot", "Bird", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_4);
        Animal animal_5 = new Animal("Hummingbird", "Bird", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_5);
        Animal animal_6 = new Animal("Penguin", "Bird", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_6);

        //        fish
        Animal animal_7 = new Animal("Goldfish", "Fish", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_7);
        Animal animal_8 = new Animal("Salmon", "Fish", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_8);
        Animal animal_9 = new Animal("Tuna", "Fish", "152", "Sound", "Image", "This is a bear");
        animalsdb.add(animal_9);

        Toast.makeText(getApplicationContext(), "Complete", Toast.LENGTH_LONG).show();

        return animalsdb;
    }

    public void onZooActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), CategoryListViewActivity.class);
        startActivity(intent);
    }
}
