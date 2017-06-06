package com.pandana.pandanaapp.meterial;

import android.app.Activity;
import android.os.Bundle;

import com.pandana.pandanaapp.R;

public class UCDetailAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucdetail);

//        findViewById(R.id.obser).setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent event) {
//
//                switch (event.getAction()){
//
//                    case MotionEvent.ACTION_MOVE:
//                        view.setX(event.getRawX() - view.getWidth()/2);
//                        view.setY(event.getRawY()- view.getHeight()/2);
//                        break;
//                }
//                return false;
//            }
//        });
    }
}
