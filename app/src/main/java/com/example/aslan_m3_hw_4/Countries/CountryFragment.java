package com.example.aslan_m3_hw_4.Countries;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.aslan_m3_hw_4.Continents.Continent;
import com.example.aslan_m3_hw_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private ArrayList<Country> countriesList;
    CountryAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        Integer test = getArguments().getInt("Asia");
        if (test == 0){
            continentAsia();
        } if (test == 1) {
            continentEurope();
        } if (test == 2) {
            continentAfrica();
        }  if (test == 3) {
            continentNorthAmerica();
        }  if (test == 4) {
            continentSouthAmerica();
        }

        adapter = new CountryAdapter(countriesList, this);
        binding.rvCountry.setAdapter(adapter);

    }

    private void loadData() {
        continentAsia();
        continentEurope();
        continentAfrica();
        continentNorthAmerica();
        continentSouthAmerica();

    }
    private void continentAsia() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Kyrgyzstan", "Bishkek","Population 7 million","https://images2.pics4learning.com/catalog/k/kyrgyzstanfl.jpg"));
        countriesList.add(new Country("Kazakhstan", "Astana","Population 19 million","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1200px-Flag_of_Kazakhstan.svg.png"));
        countriesList.add(new Country("Japan", "Tokyo","Population 125 million","https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png"));
        countriesList.add(new Country("South Korea", "Seul","Population 51 million","https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/1200px-Flag_of_South_Korea.svg.png"));
        countriesList.add(new Country("Indonesia", "Jakarta","Population 273 million","https://flags-world.com/wp-content/uploads/2021/01/flag-indonezii-3.png"));
        countriesList.add(new Country("Thailand", "Bangkok","Population 71 million","https://cdn.britannica.com/38/4038-004-111388C2/Flag-Thailand.jpg"));
        countriesList.add(new Country("India", "New Deli","Population 1.4 billion","https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
        countriesList.add(new Country("Malaysia", "Kuala-Lumpur","Population 33 million","https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
        countriesList.add(new Country("China", "Beijing","Population 1.5 billion","https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
        countriesList.add(new Country("Uzbekistan", "Tashkent","Population 34 million","https://img5.goodfon.ru/wallpaper/big/0/35/uzbekistan-flag-uzbekistan-large-flag-flag-of-uzbekistan-uzb.jpg"));

    }

    private void continentSouthAmerica() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Argentina", "Buenos Aires","Population 7 million","https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg"));
        countriesList.add(new Country("Chili", "Santiago","Population 25 million","https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png"));
        countriesList.add(new Country("Brazil", "Brazilia","Population 216 million","https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png"));
        countriesList.add(new Country("Ecuador", "Kito","Population 17 million","https://cdn.pixabay.com/photo/2012/04/10/23/23/ecuador-26986_960_720.png"));
        countriesList.add(new Country("Colombia", "Bogota","Population 51 million","https://www.flagsonline.it/uploads/2016-10-7/1200-0/repubblica-di-colombia.jpg"));
        countriesList.add(new Country("Peru", "Lima","Population 33 million","https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));
        countriesList.add(new Country("Venezuela", "Karakas","Population 22 million","https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png"));
        countriesList.add(new Country("Bolivia", "La-Pas","Population 12 million","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Bandera_de_Bolivia_%28Estado%29.svg/1200px-Bandera_de_Bolivia_%28Estado%29.svg.png"));
        countriesList.add(new Country("Uruguay", "Montevideo","Population 3 million","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/1200px-Flag_of_Uruguay.svg.png"));
        countriesList.add(new Country("Paraguay", "Asuncion","Population 6 million","https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/1200px-Flag_of_Paraguay.svg.png"));

    }

    private void continentNorthAmerica() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("USA", "Washington","Population 350 million","https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/188px-Flag_of_the_United_States.svg.png"));
        countriesList.add(new Country("Canada", "Ottawa","Population 38 million","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countriesList.add(new Country("Mexico", "Mehiko","Population 126 million","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countriesList.add(new Country("Greenland", "Nuuk","Population 56 thousands","https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_Greenland.svg/1200px-Flag_of_Greenland.svg.png"));
        countriesList.add(new Country("Cuba", "Havana","Population 11 million","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/1200px-Flag_of_Cuba.svg.png"));
        countriesList.add(new Country("Panama", "Panama","Population 4 million","https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/1200px-Flag_of_Panama.svg.png"));
        countriesList.add(new Country("Jamajka", "Kingston","Population 2 million","https://flagof.ru/wp-content/uploads/2018/10/Jamaica.png"));
        countriesList.add(new Country("Costa Rica", "San Hose","Population 5 million","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Costa_Rica_%28state%29.svg/240px-Flag_of_Costa_Rica_%28state%29.svg.png"));
        countriesList.add(new Country("Guatemala", "Guatemala","Population 17 million","https://img.theculturetrip.com/wp-content/uploads/2018/04/guatemala-26964_1280-1.png"));
        countriesList.add(new Country("Haiti", "Port-O-Prens","Population 11 million","https://starspangledflags.com/wp-content/uploads/haiti-national-flag.jpg"));

    }

    private void continentEurope() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("France", "Paris","Population 67 million","https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/800px-Flag_of_France.svg.png"));
        countriesList.add(new Country("UK", "London","Population 67 million","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Great_Britain_%281707%E2%80%931800%29.svg/2560px-Flag_of_Great_Britain_%281707%E2%80%931800%29.svg.png"));
        countriesList.add(new Country("Spain", "Madrid","Population 47 million","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_the_First_Spanish_Republic.svg/2560px-Flag_of_the_First_Spanish_Republic.svg.png"));
        countriesList.add(new Country("Germany", "Berlin","Population 83 million","https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
        countriesList.add(new Country("Poland", "Warsaw","Population 37 million","https://cargomaster.info/wp-content/uploads/2021/09/%D0%BF%D0%BE%D0%BB%D1%8C%D1%88%D0%B0.png"));
        countriesList.add(new Country("Russia", "Moscow","Population 150 million","https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/640px-Flag_of_Russia.svg.png"));
        countriesList.add(new Country("Italy", "Rome","Population 59 million","https://thumbs.dreamstime.com/b/flag-italy-linen-fabric-136307163.jpg"));
        countriesList.add(new Country("Sweden", "Stockholm","Population 10 million","https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/1200px-Flag_of_Sweden.svg.png"));
        countriesList.add(new Country("Netherlands", "Amsterdam","Population 17 million","https://zname.com.ua/watermark/watermark.php?image=https://zname.com.ua/image/cache/catalog/content/Flagi-mira/FSM123_Netherlands_2x3-800x533.jpg"));
        countriesList.add(new Country("Iceland", "Reykjavik","Population 372 thousands","https://images.prom.ua/1321079045_w640_h640_flag-islandii.jpg"));

    }

    private void continentAfrica() {
        countriesList = new ArrayList<>();
        countriesList.add(new Country("Nigeria", "Abuja","Population 213 million","https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/188px-Flag_of_Nigeria.svg.png"));
        countriesList.add(new Country("Egypt", "Cairo","Population 109 million","https://to-name.ru/images/historical-events/flag-egipta.jpg"));
        countriesList.add(new Country("Morocco", "Rabat","Population 37 million","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png"));
        countriesList.add(new Country("Zambia", "Lusaka","Population 19 million","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png"));
        countriesList.add(new Country("Tanzania", "Dodoma","Population 63 million","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png"));
        countriesList.add(new Country("Ethiopia", "Addis-Abeba","Population 120 million","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
        countriesList.add(new Country("South Africa", "Cape town","Population 59 million","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
        countriesList.add(new Country("Kenya", "Nairobi","Population 53 million","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
        countriesList.add(new Country("Uganda", "Kampala","Population 45 million","https://cdn.britannica.com/22/22-004-0165975D/Flag-Uganda.jpg"));
        countriesList.add(new Country("Madagascar", "Antananarivo","Population 28 million","https://images.prom.ua/1321092787_w640_h640_1321092787.jpg"));

    }



}