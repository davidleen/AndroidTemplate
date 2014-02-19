package com.example.david.acts;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.example.david.R;
import com.example.david.frags.AListFragment;
import com.example.david.utils.ToastUtil;

/**
 * Created by davidleen29@gmail.com on 14-2-17
 */
public class MainActivity extends NormalWaterfallActivity {

    @Override
    public Fragment getContent() {

        ActionBar actionBar = getSupportActionBar();
       // actionBar.hide();

        return new AListFragment();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_compose:
                composeMessage();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void composeMessage() {
        ToastUtil.message(this, "composeMessage");
    }

    private void openSearch() {
        ToastUtil.message(this, "doSearch");


    }
}