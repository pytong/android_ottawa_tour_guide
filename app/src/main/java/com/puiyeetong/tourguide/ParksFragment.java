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
public class ParksFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.rideau_canal_name, R.string.rideau_canal_details, R.drawable.rideau_canal));
        locations.add(new Location(R.string.macdonald_parkway_name, R.string.macdonald_parkway_details, R.drawable.macdonald_parkway));
        locations.add(new Location(R.string.hogs_back_fall_name, R.string.hogs_back_fall_details, R.drawable.hogs_back_falls));
        locations.add(new Location(R.string.majors_hill_park_name, R.string.majors_hill_park_details, R.drawable.majors_hill_park));
        locations.add(new Location(R.string.rideau_falls_name, R.string.rideau_falls_details, R.drawable.rideau_falls));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
