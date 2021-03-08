package com.example.project_room;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Game_End_Activity extends AppCompatActivity {
    MediaPlayer player;
    ImageView gameEndView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__end_);
        player = MediaPlayer.create(this, R.raw.endbgm);
        player.setVolume(0.2f, 0.2f);
        player.setLooping(true);
        player.start();
        gameEndView = findViewById(R.id.gameEndView);
        Glide.with(this).load(R.drawable.game_end).into(gameEndView);

        gameEndView = findViewById(R.id.gameEndView);
        gameEndView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if(action == MotionEvent.ACTION_DOWN){
                    game_end();
                }
                return true;
            }
        });
    }

    @Override
    protected void onStop(){
        player.stop();
        super.onStop();
    }

    void game_end(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){

    }
}
