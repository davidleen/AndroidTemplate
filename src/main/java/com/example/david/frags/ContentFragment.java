package com.example.david.frags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.example.david.R;

/**
 * Created by davidleen29@gmail.com on 14-2-17.
 */
public abstract class ContentFragment extends BaseFragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View content=getFragmentView(inflater, savedInstanceState);

        if (!isCrollContent())
        {

            //不是滚动面板 则添加滚动控件
            int padding=(int)getResources().getDimension( R.dimen.cotent_padding);
            content.setPadding(padding,padding,padding,padding);

            ScrollView scrollView=new ScrollView(getActivity());
            ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setLayoutParams(lp            );
            scrollView.addView(content);
            content=scrollView;
        }




        return content;

    }

    protected abstract View getFragmentView(LayoutInflater inflater , Bundle savedInstanceState);

    /**
     * 内容
     *是否是滚动的  如list
     *
     * 可以重载， 不懂的参数 对应不同的布局
     */
    protected  boolean  isCrollContent()
    {


        return false;
    }
}
