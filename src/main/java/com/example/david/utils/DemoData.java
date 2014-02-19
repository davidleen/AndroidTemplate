package com.example.david.utils;

import com.example.david.beans.Dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidleen29@gmail.com on 14-2-18.
 */
public class DemoData {

    private static List<Dictionary> dictionarys;


    public static List<Dictionary> getDictionaryList() {

        if (dictionarys == null) {
            int length = 20;
            dictionarys = new ArrayList<Dictionary>(length

            );
            Dictionary temp;
            for (int i = 0; i < length; i++) {
                temp = new Dictionary();
                temp.setId(i
                );
                temp.setName("dictionary:" + i);
                dictionarys.add(temp
                );
            }

        }

        return dictionarys;


    }


}
