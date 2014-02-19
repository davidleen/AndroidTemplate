package com.example.david.acts;



import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.david.utils.Log;

/**
 * Created by davidleen29@gmail.com on 14-2-14.
 *
 *
 * override the life method  ,monitor the life circle;
 *
 *
 */
public  abstract class BaseActivity extends ActionBarActivity {


    public static final boolean  SHOW_LIFE_CIRCLE=true;


    public     String TAG;

    protected BaseActivity() {
        super();
        TAG=  getClass().getName();

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG,"onActivityResult----requestCode:"+requestCode+",resultCode:"+resultCode+",intent data:"+data);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i(TAG,"onBackPressed " );
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.i(TAG,"onConfigurationChanged    : "+newConfig );
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.i(TAG,"onCreateView    name: "+name+",context:"+context );
        return super.onCreateView(name, context, attrs);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume " );
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG,"onPostResume " );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG,"onSaveInstanceState     bundle: "+outState );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop " );
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i(TAG,"onKeyDown    keyCode: "+keyCode+",event:"+event );
        return super.onKeyDown(keyCode, event);


    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i(TAG,"onLowMemory    " );
    }



    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }
}