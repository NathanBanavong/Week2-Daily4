package com.example.consultants.week2_daily4.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.consultants.week2_daily4.Model.Animal;
import com.example.consultants.week2_daily4.Model.Category;

import java.util.ArrayList;
import java.util.List;

public class AnimalDatabase extends SQLiteOpenHelper {
    public AnimalDatabase(Context context) {
        super(context, AnimalContract.NAME, null, AnimalContract.VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(AnimalContract.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //    TODO filter the database to get only the categories
    public List<Animal> getCategory() {
        SQLiteDatabase db = getWritableDatabase();

        List<Animal> categoryList = new ArrayList<>();
        Cursor cursor = db.rawQuery(AnimalContract.GET_CATEGORIES, null);

        if (cursor.moveToFirst()) {
            do {
                Animal animalCategory = new Animal(cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_CATEGORY)));
                categoryList.add(animalCategory);
            } while (cursor.moveToNext());
        }
        db.execSQL(AnimalContract.GET_CATEGORIES);
        return categoryList;
    }

//    public List<String> getCategories() {
//        SQLiteDatabase db = getWritableDatabase();
//
//        List<String> animalCategories = new ArrayList<>();
//        String leCategory;
//
//        Cursor cursor = db.rawQuery(AnimalContract.GET_CATEGORIES, null);
//
//        if (cursor.moveToFirst()) {
//            do {
//                leCategory = cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_CATEGORY));
//                animalCategories.add(leCategory);
//            } while (cursor.moveToNext());
//        }
//        db.execSQL(AnimalContract.GET_CATEGORIES);
//        return animalCategories;
//    }

    public List<Animal> getAnimal() {
        SQLiteDatabase db = getWritableDatabase();

        List<Animal> animalList = new ArrayList<>();

        Cursor cursor = db.rawQuery(AnimalContract.GET_ALL, null);

        if (cursor.moveToFirst()) {
            do {
                Animal animal = new Animal(cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_NAME)),
                        cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_CATEGORY)),
                        cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_WEIGHT)),
                        cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_SOUND)),
                        cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_DESCRIPTION)),
                        cursor.getString(cursor.getColumnIndex(AnimalContract.FeedEntry.COL_IMAGE)));
                animalList.add(animal);     //add animal into list
            } while (cursor.moveToNext());
        }
        db.execSQL(AnimalContract.GET_ALL);
        return null;
    }

    public void saveAnimal(List<Animal> animal) {
        SQLiteDatabase db = getWritableDatabase();

        for (int i = 0; i < animal.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AnimalContract.FeedEntry.COL_NAME, String.valueOf(animal.get(i).getName()));
            contentValues.put(AnimalContract.FeedEntry.COL_CATEGORY, String.valueOf(animal.get(i).getDescription()));
            contentValues.put(AnimalContract.FeedEntry.COL_WEIGHT, String.valueOf(animal.get(i).getWeight()));
            contentValues.put(AnimalContract.FeedEntry.COL_SOUND, String.valueOf(animal.get(i).getSound()));
            contentValues.put(AnimalContract.FeedEntry.COL_DESCRIPTION, String.valueOf(animal.get(i).getDescription()));
            contentValues.put(AnimalContract.FeedEntry.COL_IMAGE, String.valueOf(animal.get(i).getImage()));
            db.insert(AnimalContract.FeedEntry.TABLE_NAME, null, contentValues);
        }

    }
}
