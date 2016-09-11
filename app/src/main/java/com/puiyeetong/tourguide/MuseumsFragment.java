package com.puiyeetong.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by puiyee on 2016-09-07.
 */
public class MuseumsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.canadian_museum_of_nature_name, R.string.canadian_museum_of_nature_details, R.drawable.museum_of_nature));
        locations.add(new Location(R.string.canadian_museum_of_history_name, R.string.canadian_museum_of_history_details, R.drawable.museum_of_history));
        locations.add(new Location(R.string.canadian_war_museum_name, R.string.canadian_war_museum_details, R.drawable.canadian_war_museum));
        locations.add(new Location(R.string.national_gallery_of_canada_name, R.string.national_gallery_of_canada_details, R.drawable.national_gallery_of_canada));
        locations.add(new Location(R.string.canada_aviation_and_space_museum_name, R.string.canada_aviation_and_space_museum_details, R.drawable.canada_aviation_and_space_museum));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
