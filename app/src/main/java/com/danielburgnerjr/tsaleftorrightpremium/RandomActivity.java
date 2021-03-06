package com.danielburgnerjr.tsaleftorrightpremium;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {

    private ImageView imvLeftArrow;
    private ImageView imvRightArrow;
    private Button btnTryAgain;
    private Animation aniTransition;
    static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        imvLeftArrow = findViewById(R.id.imgLeft);
        imvRightArrow = findViewById(R.id.imgRight);
        btnTryAgain = findViewById(R.id.btnTryAgain);

        aniTransition = new AlphaAnimation(1, 0);
        aniTransition.setDuration(SPLASH_TIME_OUT);
        aniTransition.setStartOffset(SPLASH_TIME_OUT);
        imvLeftArrow.setAnimation(aniTransition);
        imvRightArrow.setAnimation(aniTransition);

        aniTransition.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imvLeftArrow.setVisibility(View.GONE);
                imvRightArrow.setVisibility(View.GONE);
                btnTryAgain.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        btnTryAgain.setOnClickListener(view -> {
            Random rndR = new Random();
            int nChoice = rndR.nextInt(2);
            btnTryAgain.setVisibility(View.GONE);
            if (nChoice == 0) {
                imvLeftArrow.setVisibility(View.VISIBLE);
                imvLeftArrow.startAnimation(aniTransition);
            } else {
                imvRightArrow.setVisibility(View.VISIBLE);
                imvRightArrow.startAnimation(aniTransition);
            }
        });
     }
}
