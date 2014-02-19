package com.example.david.frags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.david.R;
import com.example.david.acts.ActivityRoutinUtils;

/**
 * Created by davidleen29@gmail.com on 14-2-17.
 */
public class LaunchFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.launch_fragment, container, false);
        v.findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityRoutinUtils.startMainActvity(LaunchFragment.this);
            }
        });
        return v;
    }
}