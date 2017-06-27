package com.ynaito.gesturedetectorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private static GestureDetector gesDetect;

    private RelativeLayout layout01 = null;
    private RelativeLayout layout02 = null;
    private RelativeLayout layout03 = null;

    private ImageView imageView01 = null;
    private ImageView imageView02 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create GestureDetector instance

        gesDetect = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                Log.d(TAG, "onDown");
                return false;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                Log.d(TAG, "onShowPress");

            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Log.d(TAG, "onSingleTapUp");
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                Log.d(TAG, "onScroll");
                return false;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                Log.d(TAG, "onLongPress");
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                Log.d(TAG, "onFling");
                return false;
            }
        });

        //set OnClickLister to each view

        layout01 = (RelativeLayout) findViewById(R.id.layout01);
//        layout01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick to layout1");
//            }
//        });
        layout02 = (RelativeLayout) findViewById(R.id.layout02);
//        layout02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick to layout2");
//            }
//        });
        layout03 = (RelativeLayout) findViewById(R.id.layout03);
//        layout03.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick to layout3");
//            }
//        });

        imageView01 = (ImageView) findViewById(R.id.imageView01);
//        imageView01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick to imageView01");
//            }
//        });
        imageView02 = (ImageView) findViewById(R.id.imageView02);
//        imageView02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick to imageView02");
//            }
//        });

        //set OnTouchLister to each view

        layout01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch : layout01 ( " + view.getId() + " ) is clicked");
                return MainActivity.onTouch(view, motionEvent);
            }
        });

        layout02.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch : layout02 ( " + view.getId() + " ) is clicked");
                return MainActivity.onTouch(view, motionEvent);
            }
        });

        layout03.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch : layout03 ( " + view.getId() + " ) is clicked");
                return MainActivity.onTouch(view, motionEvent);
            }
        });

        imageView01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch : imageView01 ( " + view.getId() + " ) is clicked");
                return MainActivity.onTouch(view, motionEvent);
            }
        });

        imageView02.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch : imageView02 ( " + view.getId() + " ) is clicked");
                return MainActivity.onTouch(view, motionEvent);
            }
        });
    }

    private static boolean onTouch(View v, MotionEvent motionEvent) {
        if (v.getId() == R.id.layout01) {
            Log.d(TAG, "layout01 is clicked!");
            return true;
//                    return false;
//            return gesDetect.onTouchEvent(motionEvent);
        }
        return false;
    }

//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        Log.d(TAG, "onTouch : id is " + view.getId() + " clicked");
//        if (view.getId() == R.id.imageView02) {
////            return false;
//            return gesDetect.onTouchEvent(motionEvent);
//        }
//        return true;
//    }
}
