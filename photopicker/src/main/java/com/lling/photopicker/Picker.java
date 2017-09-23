package com.lling.photopicker;

import android.app.Application;
import android.content.Context;

/**
 * Description :
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 2016/3/4
 */
public class Picker {

    private static Context context;

   public static void init(Application appCompatActivity){
       context = appCompatActivity;
   }



    public static Context getContext() {
        return context;
    }

}
