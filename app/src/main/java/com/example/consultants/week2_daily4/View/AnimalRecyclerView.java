package com.example.consultants.week2_daily4.View;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.consultants.week2_daily4.R;

import butterknife.BindView;

public class AnimalRecyclerView extends Activity {

    @BindView(R.id.tvAnimalName)
    TextView tvAnimalName;
    @BindView(R.id.tvAnimalCategory)
    TextView tvAnimalCategory;
    @BindView(R.id.tvAnimalWeight)
    TextView tvAnimalWeight;
    @BindView(R.id.tvAnimalDescription)
    TextView tvAnimalDescription;
    @BindView(R.id.tvAnimalSound)
    TextView tvAnimalSound;
    @BindView(R.id.tvAnimalImage)
    TextView tvAnimalImage;

    private RecyclerView rvAnimalList;
    private AnimalRecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_recycler_view);
    }

    private void bindRecyclerView() {
        rvAnimalList = findViewById(R.id.rvAnimalList);
        adapter = new AnimalRecyclerViewAdapter(PersonGenerator.generate(20));
        layoutManager = new LinearLayoutManager(this);
        rvAnimalList.setAdapter(adapter);
        rvAnimalList.setLayoutManager(layoutManager);
    }
}
