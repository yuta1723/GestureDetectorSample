package com.ynaito.gesturedetectorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    private RelativeLayout layout01 = null;
    private RelativeLayout layout02 = null;
    private RelativeLayout layout03 = null;

    private ImageView imageView01 = null;
    private ImageView imageView02 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout01 = (RelativeLayout) findViewById(R.id.layout01);
        layout01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick to layout1");
            }
        });
        layout02 = (RelativeLayout) findViewById(R.id.layout02);
        layout02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick to layout2");
            }
        });
        layout03 = (RelativeLayout) findViewById(R.id.layout03);
        layout03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick to layout3");
            }
        });

        imageView01 = (ImageView) findViewById(R.id.imageView01);
        imageView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick to imageView01");
            }
        });
        imageView02 = (ImageView) findViewById(R.id.imageView02);
        imageView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick to imageView02");
            }
        });
    }
}
