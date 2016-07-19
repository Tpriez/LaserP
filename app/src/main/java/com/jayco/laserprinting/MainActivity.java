package com.jayco.laserprinting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout container = (LinearLayout)findViewById (R.id.container);
        myView view = new myView (this);
        container.addView(view);
    }
}
