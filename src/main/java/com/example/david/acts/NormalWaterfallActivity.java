package com.example.david.acts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.example.david.R;
import com.example.david.frags.NormalHeadFragment;

/**
 * Created by davidleen29@gmail.com
 * on 14-2-17.
 * 瀑布流的act 布局   头部/内容/ 格式布局
 */
public abstract class NormalWaterfallActivity extends WaterfallActivity {

    @Override
    public   Fragment getHead() {
      return  new NormalHeadFragment();
    }
    @Override
    public abstract Fragment getContent() ;
}
