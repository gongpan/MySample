package com.pandana.pandanaapp.meterial;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * Created by gongpan on 2017/6/6.
 */

public class UCEmulateBehavior extends CoordinatorLayout.Behavior<TextView> {

    private int mFrameMaxHeight = 100;
    private int mStartY;

    public UCEmulateBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        return dependency instanceof Toolbar;
    }


    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {

        Log.i("lsh","dependency Y ==》"+dependency.getY()+"");
        if (mStartY == 0) {
            mStartY = (int) dependency.getY();
            Log.i("lsh","mStartY ==》"+mStartY+"");
        }

        float percent = dependency.getY() / mStartY;
        Log.i("lsh","percent ==》"+percent+"");

        child.setY(-child.getHeight()*percent);
        return true;
    }
}
