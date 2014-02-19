package com.example.david.acts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.example.david.R;
import com.example.david.frags.DetailsFragment;

/**
 * Created by davidleen29@gmail.com on 14-2-18.
 */
public class DetailsActivity extends NormalWaterfallActivity {

    @Override
    public Fragment getContent() {
        return new DetailsFragment();
    }
}