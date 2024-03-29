package com.example.sana.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.sana.fragmentexample.R.id.fTextFragment;

/**
 * Created by sana on 12/5/18.
 */

public class MenuFragment extends ListFragment {
    String[] AndroidOS = new String[]{"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream SandWich", "Jelly Bean", "KitKat"};
    String[] Version = new String[]{"1.5", "1.6", "2.0-2.1", "2.2", "2.3", "3.0-3.2", "4.0", "4.1-4.3", "4.4"};

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        //View view1 = inflater.inflate(R.layout.fragment_text, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidOS);
        setListAdapter(adapter);
        //final FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
        // final FloatingActionButton fab1 = (FloatingActionButton)view1.findViewById(R.id.fab1);
        /*fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getActivity(), "button clicked", Toast.LENGTH_SHORT).show();
        //fab1.setVisibility(View.INVISIBLE);
    }
});*/
        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        TextFragment txt = (TextFragment) getFragmentManager().findFragmentById(R.id.fTextFragment);
        txt.change(AndroidOS[position], "Version : " + Version[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}
