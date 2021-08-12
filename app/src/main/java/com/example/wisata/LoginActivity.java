//12082021_10118701_StenlyGustafDamping_IF10
package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button1;

    public static void getBoolean(String firstTime, boolean b) {
    }

    public static SharedPreferences.Editor edit() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),MenuUtama.class);
            startActivity(intent1);
        });
    }
}