package io.github.alupa.seccion_10_translations;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        Toast.makeText(v.getContext(), getString(R.string.welcome), Toast.LENGTH_SHORT).show();
        //Toast.makeText(v.getContext(), Util.getWelcome(v.getContext()), Toast.LENGTH_SHORT).show();

        return v;
    }
}
