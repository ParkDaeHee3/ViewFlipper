package com.example.viewflipper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btnPrev, btnNext; // linearlayout version
        Button btnStart, btnStop;
        final ViewFlipper vFlipper;

        //btnPrev = (Button) findViewById(R.id.btnPrev); //linearlayout version
        //btnNext = (Button) findViewById(R.id.btnNext); // linearlayout version

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        vFlipper=(ViewFlipper) findViewById(R.id.viewFlipper1);

        /* [linearlayout_version]
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showPrevious();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });
        */
        vFlipper.setFlipInterval(1000);
        btnStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                vFlipper.startFlipping();
                vFlipper.setFlipInterval(1000);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                vFlipper.stopFlipping();
            }
        });

    }
}