package com.danielburgnerjr.tsaleftorrightpremium;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final Button btnStory = findViewById(R.id.btnStory);
        btnStory.setOnClickListener(view -> {
            Intent intStory = new Intent("android.intent.action.VIEW", Uri.parse("http://www.geek.com/apps/tsa-paid-1-4-million-for-randomizer-app-that-chooses-left-or-right-1651337/"));
            startActivity(intStory);
        });
    }
}
