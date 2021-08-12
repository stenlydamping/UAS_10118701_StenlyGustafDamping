//12082021_10118701_StenlyGustafDamping_IF10
package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;

    //variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo;

    SharedPreferences LoginActivity;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.animator.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.animator.bottom_animation);

        //Hooks
        image = findViewById(R.id.ImageView);
        logo = findViewById(R.id.textView);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {

                LoginActivity = getSharedPreferences("LoginActivity" ,MODE_PRIVATE);
                boolean isFirstTime = LoginActivity.getBoolean("firstTime", true);

                if(isFirstTime){

                    SharedPreferences.Editor editor = LoginActivity.edit();
                    editor.putBoolean("firstTime", false);
                    editor.commit();
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,MenuUtama.class);
                    startActivity(intent);
                    finish();
                }

            }
        },SPLASH_SCREEN);

    }
}