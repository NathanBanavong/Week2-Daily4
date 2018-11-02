package com.example.consultants.week2_daily4.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.consultants.week2_daily4.Model.Animal;
import com.example.consultants.week2_daily4.R;

import java.util.List;

public class AnimalRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Animal> animalList;

    public AnimalRecyclerViewAdapter(List<Animal>animalList){
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//TODO need to create different layout for each animal -> viewType: Animal Category
        //        int itemViewLayout;
//
//        if(viewType ==1) { itemViewLayout = R.layout.person_item_male;}
//        else itemViewLayout = R.layout.person_item_female;
//
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemViewLayout,viewGroup, false);
////        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_item,viewGroup, false);
//        return new ViewHolder(view);

        return null;
    }

//    @Override
//    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {
//        tvAnimalName = convertView.findViewById(R.id.tvAnimalName);
//        tvAnimalCategory = convertView.findViewById(R.id.tvAnimalCategory);
//        tvAnimalWeight = convertView.findViewById(R.id.tvAnimalWeight);
//        tvAnimalDescription = convertView.findViewById(R.id.tvAnimalDescription);
//        tvAnimalSound = convertView.findViewById(R.id.tvAnimalSound);
//        tvAnimalImage = convertView.findViewById(R.id.tvAnimalImage);
//        Animal animal = animalList.get(position);
//
////                viewholder.tvPersonName.setText(person.getName());
//        viewHolder.tvAnimalName.setText(animal.getName());
//        viewHolder.tvAnimalCatergory.
//    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Animal animal = animalList.get(position);

        viewHolder.tvAnimalName.setText(animal.getName());
        viewHolder.tvAnimalDescription.setText(animal.getDescription());
        viewHolder.tvAnimalCategory.setText(animal.getCategory());
        viewHolder.tvAnimalWeight.setText(animal.getWeight());
        viewHolder.tvAnimalSound.setText(animal.getSound());
        viewHolder.tvAnimalImage.setText(animal.getSound());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvAnimalName;
        private final TextView tvAnimalCategory;
        private final TextView tvAnimalWeight;
        private final TextView tvAnimalDescription;
        private final TextView tvAnimalSound;
        private final TextView tvAnimalImage;

        ViewHolder(View itemView) {
            super(itemView);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalName);
            tvAnimalCategory = itemView.findViewById(R.id.tvCategoryName);
            tvAnimalWeight = itemView.findViewById(R.id.tvAnimalWeight);
            tvAnimalDescription = itemView.findViewById(R.id.tvAnimalDescription);
            tvAnimalSound = itemView.findViewById(R.id.tvAnimalSound);
            tvAnimalImage = itemView.findViewById(R.id.tvAnimalImage);
        }
    }
}
