package com.example.android.top5sandiego;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {
    //Location of all the rank number strings
    int[] ranksRes = {R.string.rank_1, R.string.rank_2, R.string.rank_3,
            R.string.rank_4, R.string.rank_5};

    //Location of all the location strings
    int[] locationRes = {R.string.hotel_1, R.string.hotel_2, R.string.hotel_3,
            R.string.hotel_4, R.string.hotel_5};


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.location_list, container, false);
        ImageView imageView = rootView.findViewById(R.id.image);

        //Create a Location ArrayList to store the data
        ArrayList<Location> locations = new ArrayList<>();

        //add locations to the locations ArrayList
        locations.add(new Location(getString(ranksRes[0]),getString(locationRes[0]),R.drawable.default_image));
        locations.add(new Location(getString(ranksRes[1]),getString(locationRes[1]),R.drawable.default_image));
        locations.add(new Location(getString(ranksRes[2]),getString(locationRes[2]),R.drawable.default_image));
        locations.add(new Location(getString(ranksRes[3]),getString(locationRes[3]),R.drawable.default_image));
        locations.add(new Location(getString(ranksRes[4]),getString(locationRes[4]),R.drawable.default_image));

        //Create an LocationAdapter to set on the ListView
        LocationAdapter locationAdapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
