package com.example.sana.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sana on 12/5/18.
 */

public class TextFragment extends Fragment {
    TextView text, vers;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_text, container, false);
        text = (TextView) view.findViewById(R.id.AndroidOs);
        vers = (TextView) view.findViewById(R.id.Version);


        return view;

    }

    public void change(String txt, String txt1) {
        text.setText(txt);
        vers.setText(txt1);

    }
}
