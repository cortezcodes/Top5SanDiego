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
public class NightLifeFragment extends Fragment {
    //Location of all the rank number strings
    int[] ranksRes = {R.string.rank_1, R.string.rank_2, R.string.rank_3,
            R.string.rank_4, R.string.rank_5};

    //Location of all the location strings
    int[] locationRes = {R.string.bar_onxy, R.string.bar_the_local, R.string.bar_el_prez,
            R.string.bar_altitude, R.string.bar_polite_provisions};

    //Location description strings
    int[] locationDescription = {R.string.bar_onxy_description,
            R.string.bar_the_local_description, R.string.bar_el_pres_description,
            R.string.bar_altitude_description, R.string.bar_polite_provisions_description};


    public NightLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.location_list, container, false);

        //Create a Location ArrayList to store the data
        ArrayList<Location> locations = new ArrayList<>();

        //add locations to the locations ArrayList
        locations.add(new Location(getString(ranksRes[0]),getString(locationRes[0]),R.drawable.nightlife_onxy, getString(locationDescription[0])));
        locations.add(new Location(getString(ranksRes[1]),getString(locationRes[1]),R.drawable.nightlife_the_local, getString(locationDescription[1])));
        locations.add(new Location(getString(ranksRes[2]),getString(locationRes[2]),R.drawable.nightlife_el_pres, getString(locationDescription[2])));
        locations.add(new Location(getString(ranksRes[3]),getString(locationRes[3]),R.drawable.nightlife_altitude, getString(locationDescription[3])));
        locations.add(new Location(getString(ranksRes[4]),getString(locationRes[4]),R.drawable.nightlife_polite_provisions, getString(locationDescription[4])));

        //Create an LocationAdapter to set on the ListView
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
