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
public class OutdoorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.capital_cruises_name, R.string.capital_cruises_details, R.drawable.capital_cruises));
        locations.add(new Location(R.string.escape_bicycle_tours_name, R.string.escape_bicycle_tours_details, R.drawable.escape_bicycle_tours));
        locations.add(new Location(R.string.algonquin_park_canoe_trip_name, R.string.algonquin_park_canoe_trip_details, R.drawable.algonquin_park_canoe_trip));
        locations.add(new Location(R.string.ottawa_city_rafting_name, R.string.ottawa_city_rafting_details, R.drawable.ottawa_city_rafting));
        locations.add(new Location(R.string.ottawa_biplane_adventures_name, R.string.ottawa_biplane_adventures_details, R.drawable.ottawa_biplane_adventures));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
