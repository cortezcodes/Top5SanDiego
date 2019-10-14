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
public class LandmarksFragment extends Fragment {
    //Location of all the rank number strings
    int[] ranksRes = {R.string.rank_1, R.string.rank_2, R.string.rank_3,
            R.string.rank_4, R.string.rank_5};

    //Location of all the location strings
    int[] locationRes = {R.string.landmark_balboa_park, R.string.landmark_torrey_pines, R.string.landmark_san_diego_zoo,
            R.string.landmark_pacific_beach, R.string.landmark_mission_bay};

    //Location description strings
    int[] locationDescription = {R.string.landmark_balboa_park_description,
            R.string.landmark_torrey_pines_description, R.string.landmark_san_diego_zoo_description,
            R.string.landmark_pacific_beach_description, R.string.landmark_mission_bay_description};


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.location_list, container, false);

        //Create a Location ArrayList to store the data
        ArrayList<Location> locations = new ArrayList<>();

        //add locations to the locations ArrayList
        locations.add(new Location(getString(ranksRes[0]),getString(locationRes[0]),R.drawable.landmark_balboa_park, getString(locationDescription[0])));
        locations.add(new Location(getString(ranksRes[1]),getString(locationRes[1]),R.drawable.landmark_torre_pines, getString(locationDescription[1])));
        locations.add(new Location(getString(ranksRes[2]),getString(locationRes[2]),R.drawable.landmark_san_diego_zoo, getString(locationDescription[2])));
        locations.add(new Location(getString(ranksRes[3]),getString(locationRes[3]),R.drawable.landmark_pacific_beach, getString(locationDescription[3])));
        locations.add(new Location(getString(ranksRes[4]),getString(locationRes[4]),R.drawable.landmark_mission_bay, getString(locationDescription[4])));

        //Create an LocationAdapter to set on the ListView
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
