package com.jayco.laserprinting.intro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.jayco.laserprinting.Painter;
import com.jayco.laserprinting.R;

/**
 * 인트로 액티비티
 */
public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        init();
    }

    /**
     * 인트로 화면 지연
     */
    private void init(){
        Handler handler = new Handler (){
            @Override
            public void handleMessage(Message msg){
                finish ();
                Intent intent = new Intent(IntroActivity.this, Painter.class);
                startActivity(intent);

            }
        };
        handler.sendEmptyMessageDelayed (0,2000);
    }
}
