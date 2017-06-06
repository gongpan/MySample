package com.pandana.pandanaapp.meterial;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pandana.pandanaapp.R;

public class CoordinatorDetailAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_detail);

        final NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.scrollView);
        FloatingActionButton floatBtn = (FloatingActionButton) findViewById(R.id.floatBtn);


        floatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetBehavior behavior = BottomSheetBehavior.from(scrollView);
                behavior.setState(behavior.getState() == BottomSheetBehavior.STATE_COLLAPSED?
                        BottomSheetBehavior.STATE_EXPANDED:BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
    }
}
