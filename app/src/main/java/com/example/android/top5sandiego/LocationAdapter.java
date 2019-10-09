package com.example.android.top5sandiego;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param locationList A List of Location objects to display in the list.
     */
    public LocationAdapter(@NonNull Context context, ArrayList<Location> locationList) {
        super(context, 0, locationList);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position the position in the list of data that should be displayed in the list item
     *                 view
     * @param convertView The recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation.
     * @return the Viuew for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        //Retrieve the recycled view to populate
        View listItemView = convertView;

        //If there is no previously recycled view create a new view
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_item, parent,
                    false);
        }

        //Get the Location Object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the ImageView in the location_item.xml layout and set the image from the location
        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_image_view);
        locationImageView.setImageResource(currentLocation.getImageSource());

        //Find the TextView for the rank in the location_item.xml layout and set it based of
        //the location.
        TextView rankTextView = (TextView) listItemView.findViewById(R.id.location_rank_text_view);
        rankTextView.setText(currentLocation.getRank());

        //TextView for the name of the location set based of the Location object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name_text_view);
        nameTextView.setText(currentLocation.getName());

        return listItemView;
    }
}
