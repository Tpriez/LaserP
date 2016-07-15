package com.jayco.laserprinting.intro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.jayco.laserprinting.MainActivity;
import com.jayco.laserprinting.R;

/**
 * Created by FX603 on 2016-07-15.
 */
public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        init();
    }

    private void init() {
        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                finish();
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        handler.sendEmptyMessageDelayed(0, 2000);
    }
}
