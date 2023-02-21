package com.example.aslan_m3_hw_4.Continents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aslan_m3_hw_4.Countries.CountryFragment;
import com.example.aslan_m3_hw_4.R;
import com.example.aslan_m3_hw_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {

    private FragmentContinentBinding binding;
    private ArrayList<Continent> continentsList;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        loadData();
        adapter = new ContinentAdapter(continentsList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentsList = new ArrayList<>();
        continentsList.add(new Continent("Asia","48 countries in Asia", R.drawable.asia_map_feature));
        continentsList.add(new Continent("Europe","44 countries in Europe", R.drawable.europe_map_feature));
        continentsList.add(new Continent("Africa","54 countries in Africa", R.drawable.africa_map));
        continentsList.add(new Continent("North America","23 countries in North America", R.drawable.north_america_map_feature));
        continentsList.add(new Continent("South America","12 countries in South America", R.drawable.south_america_map));
    }


    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Asia", continentsList);
            CountryFragment countryFragment = new CountryFragment();
             countryFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, countryFragment).addToBackStack(null).commit();

        /*
        if(position == 0) {
            CountryFragment fragment = new CountryFragment();
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, fragment).addToBackStack(null).commit();
        }

         */
    }
}