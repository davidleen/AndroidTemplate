package com.example.david.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by davidleen29@gmail.com on 14-2-19.
 */
public class ToastUtil {



    public static void message(Context context
                               ,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();;
    }
}
