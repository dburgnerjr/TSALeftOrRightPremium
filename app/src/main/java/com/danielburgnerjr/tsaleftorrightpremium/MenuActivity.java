package com.danielburgnerjr.tsaleftorrightpremium;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    String strPackName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        strPackName = getApplicationContext().getPackageName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(view -> {
            Intent intA = new Intent(MenuActivity.this, AboutActivity.class);
            startActivity(intA);
        });

        final Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> {
            Intent intA = new Intent(MenuActivity.this, RandomActivity.class);
            startActivity(intA);
        });

        final Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(view -> {
            Intent intI = new Intent(Intent.ACTION_SEND);
            intI.setType("text/plain");
            intI.putExtra(Intent.EXTRA_SUBJECT, "TSA Left or Right Premium");
            String sAux = "\nLet me recommend you this application\n\n";
            sAux = sAux + "https://play.google.com/store/apps/details?id=" + strPackName + "\n\n";
            intI.putExtra(Intent.EXTRA_TEXT, sAux);
            startActivity(Intent.createChooser(intI, "choose one"));
        });
    }

}
