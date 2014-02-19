package com.example.david.acts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.example.david.R;
import com.example.david.frags.LaunchFragment;


/**
 * 启动界面   没有头部控件
 */
public class LaunchActivity extends WaterfallActivity {

    @Override
    protected Fragment getHead() {
        return null;
    }

    @Override
    public Fragment getContent() {
        return new LaunchFragment();
    }
}
