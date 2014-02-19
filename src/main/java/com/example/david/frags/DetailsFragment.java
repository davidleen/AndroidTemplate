package com.example.david.frags;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.david.R;

/**
 * Created by davidleen29@gmail.com on 14-2-18.
 */
public class DetailsFragment extends ContentFragment {

    @Override
    protected View getFragmentView(LayoutInflater inflater, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details,null);


    }
}