package com.puiyeetong.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.parliament_hill_name, R.string.parliament_hill_details, R.drawable.parliament_hill));
        locations.add(new Location(R.string.ottawa_locks_name, R.string.ottawa_locks_details, R.drawable.ottawa_locks));
        locations.add(new Location(R.string.confederation_square_name, R.string.confederation_square_details, R.drawable.confederation_square));
        locations.add(new Location(R.string.rideau_hall_name, R.string.rideau_hall_details, R.drawable.rideau_hall));
        locations.add(new Location(R.string.dows_lake_name, R.string.dows_lake_details, R.drawable.dows_lake));
        locations.add(new Location(R.string.westboro_name, R.string.westboro_details, R.drawable.westboro));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
