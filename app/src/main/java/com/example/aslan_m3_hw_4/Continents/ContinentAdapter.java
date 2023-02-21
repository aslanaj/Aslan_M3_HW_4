package com.example.aslan_m3_hw_4.Continents;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aslan_m3_hw_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<Continent> continentsList;
    private OnClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continentsList, OnClick onItemClick) {
        this.continentsList = continentsList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentsList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    void bind(Continent continent){
        binding.tvName.setText(continent.getName());
        binding.tvNumberOfCountries.setText(continent.getNumberOfCountries());
        binding.imgContinent.setImageResource(continent.getImageMap());


    }


}
