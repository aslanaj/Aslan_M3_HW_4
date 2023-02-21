package com.example.aslan_m3_hw_4.Countries;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aslan_m3_hw_4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<Country> countriesList;

    public CountryAdapter(ArrayList<Country> countriesList, CountryFragment countryFragment) {
        this.countriesList = countriesList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
    private  ItemCountryBinding binding;

    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    void bind(Country country){
        binding.tvCountryName.setText(country.getName());
        binding.tvCountryCapital.setText(country.getCapital());
        binding.tvCountryDetail.setText(country.getDetail());
        Glide.with(binding.imgFlag).load(country.getImgFlag()).into(binding.imgFlag);

    }
}
