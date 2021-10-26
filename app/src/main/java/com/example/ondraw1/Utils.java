package com.example.ondraw1;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Utils {

    /**
     * dp --> px:
     * context.getResources().getDisPlayMetrics():获取的是内外全部的资源，在这里用不上。
     * Resources.getSystem();获取的是系统的资源。
     */
    public static float dp2dx(float dpValue){
        DisplayMetrics sysDisplayMetrics = Resources.getSystem().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpValue,sysDisplayMetrics);
    }
}
