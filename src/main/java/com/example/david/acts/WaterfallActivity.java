package com.example.david.acts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.example.david.R;

/**
 * Created by davidleen29@gmail.com
 * on 14-2-17.
 * 瀑布流的act 布局   头部/内容/ 格式布局
 */
public abstract class WaterfallActivity extends BaseActivity {


    Fragment head;
    Fragment content;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waterfall_template_activity);

        head=getHead();
        content=getContent();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //存在没有头部的情况
        if (null!=head)
         ft.replace(R.id.template_head, head);
        ft.replace(R.id.template_content, content);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }


    protected abstract Fragment getHead();

    protected abstract Fragment getContent();
}
