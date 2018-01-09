package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.btn_click);
        final ImageView imgAns = findViewById(R.id.imgView_ans);

        final int[] ansArray = new int[] {
                                R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5
                            };

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random ran = new Random();
                int number = ran.nextInt(5);
                imgAns.setImageResource(ansArray[number]);
            }
        });

    }
}
