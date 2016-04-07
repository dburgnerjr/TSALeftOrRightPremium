package com.danielburgnerjr.tsaleftorrightpremium;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final Button btnStory = (Button) findViewById(R.id.btnStory);
        btnStory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intStory = new Intent("android.intent.action.VIEW", Uri.parse("http://www.geek.com/apps/tsa-paid-1-4-million-for-randomizer-app-that-chooses-left-or-right-1651337/"));
                startActivity(intStory);
            }
        });

        final Button btnReaction = (Button) findViewById(R.id.btnReaction);
        btnReaction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intStory = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=6GqmjOcmJLQ"));
                startActivity(intStory);
            }
        });

    }
}