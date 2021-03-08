package com.example.project_room;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MonitorActivity extends AppCompatActivity {

    int hint1;
    int hint2;
    int hint3;
    int hint4;
    int hint5;
    int hint6;
    int hint7;
    int hint8;

    int problem;

    Button problem1Button;
    Button problem2Button;
    Button problem3Button;
    Button problem4Button;
    Button problem5Button;
    Button problem6Button;
    Button problem7Button;
    Button problem8Button;

    ImageView problem1Image;
    ImageView problem2Image;
    ImageView problem3Image;
    ImageView problem4Image;
    ImageView problem5Image;
    ImageView problem6Image;
    ImageView problem7Image;
    ImageView problem8Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);

        problem = pref.getInt("problem", 1);

        problem1Button = (Button)findViewById(R.id.problem1Button);
        problem1Image = (ImageView)findViewById(R.id.problem1Image);

        problem2Button = (Button)findViewById(R.id.problem2Button);
        problem2Image = (ImageView)findViewById(R.id.problem2Image);

        problem3Button = (Button)findViewById(R.id.problem3Button);
        problem3Image = (ImageView)findViewById(R.id.problem3Image);

        problem4Button = (Button)findViewById(R.id.problem4Button);
        problem4Image = (ImageView)findViewById(R.id.problem4Image);

        problem5Button = (Button)findViewById(R.id.problem5Button);
        problem5Image = (ImageView)findViewById(R.id.problem5Image);

        problem6Button = (Button)findViewById(R.id.problem6Button);
        problem6Image = (ImageView)findViewById(R.id.problem6Image);

        problem7Button = (Button)findViewById(R.id.problem7Button);
        problem7Image = (ImageView)findViewById(R.id.problem7Image);

        problem8Button = (Button)findViewById(R.id.problem8Button);
        problem8Image = (ImageView)findViewById(R.id.problem8Image);

        if(problem == 1){
            problem1Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 2){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 3){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 4){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 5){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem4Image);

            problem5Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 6){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem5Image);

            problem6Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 7){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem6Image);

            problem7Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.disabled).into(problem8Image);
        }
        else if(problem == 8){
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem7Image);

            problem8Button.setVisibility(View.VISIBLE);
            Glide.with(this).load(R.drawable.activation).into(problem8Image);
        }
        else {
            problem1Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem1Image);

            problem2Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem2Image);

            problem3Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem3Image);

            problem4Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem4Image);

            problem5Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem5Image);

            problem6Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem6Image);

            problem7Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem7Image);

            problem8Button.setVisibility(View.INVISIBLE);
            Glide.with(this).load(R.drawable.clear).into(problem8Image);
        }
    }

    public void onClick_exit_button(View v){
        Intent intent = new Intent(this, RoomActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }

    public void onClick_problem_button(View v){
        Intent intent = new Intent(this, ProblemActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){

    }
}
