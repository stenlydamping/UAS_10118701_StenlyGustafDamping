//12082021_10118701_StenlyGustafDamping_IF10
package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

public class About extends AppCompatActivity {
    Button btprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btprofile = (Button) findViewById(R.id.btprofile);

        btprofile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this, Profile.class);
                finish();
                startActivity(intent);
            }
        });
    }
}