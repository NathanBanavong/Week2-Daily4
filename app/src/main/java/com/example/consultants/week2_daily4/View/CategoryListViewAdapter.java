package com.example.consultants.week2_daily4.View;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.solver.widgets.Analyzer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.consultants.week2_daily4.Database.AnimalDatabase;
import com.example.consultants.week2_daily4.Model.Animal;
import com.example.consultants.week2_daily4.Model.Category;
import com.example.consultants.week2_daily4.R;

import java.util.List;

public class CategoryListViewAdapter extends ArrayAdapter<Animal> {

//    private AnimalDatabase animalDatabase;


    public CategoryListViewAdapter(Context context, int resource, List<Animal> animalList) {
        super(context, resource, animalList);
    }

//TODO need to get the animal list from database -> Filter
    public List<Animal> getAnimalCategory () {
        AnimalDatabase animalDatabase = new AnimalDatabase(getContext());
        List<Animal> animalCategory;
        animalCategory = animalDatabase.getCategory();
        return animalCategory;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        pass the information in format of activity_category_list_view
//        has multiple textboxes for each element of animal
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_animal_list_view,parent, false);

        TextView tvAnimalName = convertView.findViewById(R.id.tvAnimalName);
        TextView tvAnimalCategory = convertView.findViewById(R.id.tvAnimalCategory);
        TextView tvAnimalWeight = convertView.findViewById(R.id.tvAnimalWeight);
        TextView tvAnimalDescription = convertView.findViewById(R.id.tvAnimalDescription);
        TextView tvAnimalSound = convertView.findViewById(R.id.tvAnimalSound);
        TextView tvAnimalImage = convertView.findViewById(R.id.tvAnimalImage);

        Animal animal = getItem(position);

        if(animal != null){
            tvAnimalName.setText(animal.getName());
            tvAnimalCategory.setText(animal.getCategory());
            tvAnimalWeight.setText(animal.getWeight());
            tvAnimalCategory.setText(animal.getCategory());
            tvAnimalDescription.setText(animal.getDescription());
            tvAnimalSound.setText(animal.getSound());
            tvAnimalImage.setText(animal.getImage());
        }

        return convertView;
    }


    }
