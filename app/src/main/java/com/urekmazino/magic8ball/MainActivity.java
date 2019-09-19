package com.urekmazino.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.askButton);
        final ImageView image = findViewById(R.id.ballImage);

        final int[] ballImages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic8ball","askButton clicked");
              Random randomNumberGenerator =  new Random();
              int randomBall = randomNumberGenerator.nextInt(5);
              Log.d("randomBall","Ball"+(randomBall+1));
              image.setImageResource(ballImages[randomBall]);

            }
        });
    }
}
