package com.danielburgnerjr.tsaleftorrightpremium;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    String strPackName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        strPackName = getApplicationContext().getPackageName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intA = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(intA);
            }
        });

        final Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intA = new Intent(MenuActivity.this, RandomActivity.class);
                startActivity(intA);
            }
        });

        final Button btnShare = (Button) findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intI = new Intent(Intent.ACTION_SEND);
                intI.setType("text/plain");
                intI.putExtra(Intent.EXTRA_SUBJECT, "TSA Left or Right Premium");
                String sAux = "\nLet me recommend you this application\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?id=" + strPackName + "\n\n";
                intI.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(intI, "choose one"));
            }
        });
    }

}
