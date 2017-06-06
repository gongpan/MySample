package com.pandana.pandanaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pandana.pandanaapp.meterial.UCDetailAct;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_coordinator).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent  intent = null ;
        switch (view.getId()){
            case  R.id.tv_coordinator:
                intent = new Intent(this, UCDetailAct.class);
                break;
        }
        startActivity(intent);
    }
}
