package com.example.project_room;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView intro_View;
    MediaPlayer bgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro_View = (ImageView)findViewById(R.id.intro);
        Glide.with(this).load(R.drawable.intro).into(intro_View);

        button = (Button)findViewById(R.id.start_button);
    }

    @Override
    protected void onResume(){
        super.onResume();
        button.setVisibility(View.VISIBLE);
        bgm = MediaPlayer.create(this, R.raw.bgm1);
        bgm.setVolume(0.2f, 0.2f);
        bgm.setLooping(true);
        bgm.start();
    }

    @Override
    protected void onStop(){
        bgm.stop();
        super.onStop();
    }

    public void onClick_start_button(View v)
    {
        button.setVisibility(View.INVISIBLE);
        MediaPlayer player = MediaPlayer.create(this, R.raw.dooropen);
        player.setVolume(1.0f, 1.0f);
        player.start();
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putBoolean("hint1", false);
        editor.putBoolean("hint2", false);
        editor.putBoolean("hint3", false);
        editor.putBoolean("hint4", false);
        editor.putBoolean("hint5", false);
        editor.putBoolean("hint6", false);
        editor.putBoolean("hint7", false);
        editor.putBoolean("hint8", false);
        editor.putInt("problem", 1);
        editor.putBoolean("door_check", false);
        editor.putBoolean("card_key", false);

        editor.commit();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
                startActivity(intent);
            }
        },3000);
    }

    @Override
    public void onBackPressed(){

    }
}
