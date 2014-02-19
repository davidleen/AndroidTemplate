package com.example.david.frags;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by davidleen29@gmail.com on 14-2-17.
 */
public class NormalHeadFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView tv=new TextView(getActivity());
        tv.setText("这是头部控件空间");
       tv.setTextColor(Color.RED);

        return   tv;
    }
}