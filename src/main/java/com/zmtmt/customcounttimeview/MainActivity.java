package com.zmtmt.customcounttimeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CountTimeView mCountTimeView;
    private Button btnStart,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountTimeView = (CountTimeView) findViewById(R.id.count_time_view);
        btnStart=(Button) findViewById(R.id.start);
        btnStart.setOnClickListener(this);
        btnStop=(Button)findViewById(R.id.stop);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                mCountTimeView.startCountTime();
                break;

            case R.id.stop:
                mCountTimeView.stopCountTime();
                break;
        }
    }
}
