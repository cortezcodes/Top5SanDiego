package com.example.android.top5sandiego;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatsFragment extends Fragment {
    //Location of all the rank number strings
    int[] ranksRes = {R.string.rank_1, R.string.rank_2, R.string.rank_3,
                    R.string.rank_4, R.string.rank_5};

    //Location of all the location strings
    int[] locationRes = {R.string.eats_born_and_raised, R.string.eats_tofu_house, R.string.eats_tajima,
            R.string.eats_city_taco, R.string.eats_eureka};

    //Location description strings
    int[] locationDescription = {R.string.eats_born_and_raised_description,
            R.string.eats_tofu_house_description, R.string.eats_tajima_description,
            R.string.eats_city_taco_description, R.string.eats_eureka_description};


    public EatsFragment() {
        // Required empty public constructor
    }

    /**
     * Inflates the fragment view into the Activity
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.location_list, container,
                false);

        //Create a Location ArrayList to store the data
        ArrayList<Location> locations = new ArrayList<>();

        //add locations to the locations ArrayList
        locations.add(new Location(getString(ranksRes[0]),getString(locationRes[0]),R.drawable.eats_born_and_raised, getString(locationDescription[0])));
        locations.add(new Location(getString(ranksRes[1]),getString(locationRes[1]),R.drawable.eats_tofu_house,getString(locationDescription[1])));
        locations.add(new Location(getString(ranksRes[2]),getString(locationRes[2]),R.drawable.eats_tajima, getString(locationDescription[2])));
        locations.add(new Location(getString(ranksRes[3]),getString(locationRes[3]),R.drawable.eats_city_taco, getString(locationDescription[3])));
        locations.add(new Location(getString(ranksRes[4]),getString(locationRes[4]),R.drawable.eats_eureka, getString(locationDescription[4])));

        //Create an LocationAdapter to set on the ListView
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list_view);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
