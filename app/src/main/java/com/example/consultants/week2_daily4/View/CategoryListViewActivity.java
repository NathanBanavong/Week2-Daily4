package com.example.consultants.week2_daily4.View;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import com.example.consultants.week2_daily4.Model.Animal;
import com.example.consultants.week2_daily4.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryListViewActivity extends Activity {

    CategoryListViewAdapter leCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_view);

        List<Animal> listCategory = new ArrayList<Animal>();
        listCategory =  leCategory.getAnimalCategory();

        ListView lvCategory = findViewById(R.id.lvAnimal);
// TODO: 11/1/2018 I need to pass a list of animals -> from Adapter
        CategoryListViewAdapter adapter = new CategoryListViewAdapter(getApplicationContext(), R.layout.listview_animal, listCategory);
        lvCategory.setAdapter(adapter);
    }


}
