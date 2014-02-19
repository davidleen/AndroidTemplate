
package com.example.david.acts;

import android.content.Intent;
import com.example.david.frags.BaseFragment;


/**
 * act 跳转公用类。 封装activity 的startAc 功能
 * <p/>
 * davidleen29@gmail.com
 */
public class ActivityRoutinUtils {

    public static  void startMainActvity(BaseFragment fragment) {

        Intent intent = new Intent(fragment.getActivity(), MainActivity.class);
        fragment.startActivityForResult(intent, 99);


    }
}
