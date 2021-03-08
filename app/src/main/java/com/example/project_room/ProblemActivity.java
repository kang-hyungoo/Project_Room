package com.example.project_room;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ProblemActivity extends AppCompatActivity {

    boolean hint1;
    boolean hint2;
    boolean hint3;
    boolean hint4;
    boolean hint5;
    boolean hint6;
    boolean hint7;
    boolean hint8;

    ImageView problemView;
    TextView problemText;
    EditText answerText;
    TextView hintText;
    int problem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);


        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);

        hint1 = pref.getBoolean("hint1", false);

        hint2 = pref.getBoolean("hint2", false);

        hint3 = pref.getBoolean("hint3", false);

        hint4 = pref.getBoolean("hint4", false);

        hint5 = pref.getBoolean("hint5", false);

        hint6 = pref.getBoolean("hint6", false);

        hint7 = pref.getBoolean("hint7", false);

        hint8 = pref.getBoolean("hint8", false);

        problem = pref.getInt("problem", 1);

        problemView = (ImageView)findViewById(R.id.problemView);

        problemText = (TextView)findViewById(R.id.problemText);

        hintText = (TextView)findViewById(R.id.hintText);

        answerText = (EditText)findViewById(R.id.answerEditText);

        if(problem == 1){
            Glide.with(this).load(R.drawable.problem_1).into(problemView);
            problemText.setText("Problem 01");
            if(hint1){
                hintText.setText("동음이의어");
            }
        }
        else if(problem == 2){
            Glide.with(this).load(R.drawable.problem_2).into(problemView);
            problemText.setText("Problem 02");
            if(hint2){
                hintText.setText("Keyboard");
            }
        }
        else if(problem == 3){
            Glide.with(this).load(R.drawable.problem_3).into(problemView);
            problemText.setText("Problem 03");
            if(hint3){
                hintText.setText("신시 : 3시 ~ 5시");
            }
        }
        else if(problem == 4){
            Glide.with(this).load(R.drawable.problem_4).into(problemView);
            problemText.setText("Problem 04");
            if(hint4){
                hintText.setText("한자");
            }
        }
        else if(problem == 5){
            Glide.with(this).load(R.drawable.problem_5).into(problemView);
            problemText.setText("Problem 05");
            if(hint5){
                hintText.setText("모든 단어는 상응하는 숫자가 있다.");
            }
        }
        else if(problem == 6){
            Glide.with(this).load(R.drawable.problem_6).into(problemView);
            problemText.setText("Problem 06");
            if(hint6){
                hintText.setText("7 Segment Number");
            }
        }
        else if(problem == 7){
            Glide.with(this).load(R.drawable.problem_7).into(problemView);
            problemText.setText("Problem 07");
            if(hint7){
                hintText.setText("Palindrome");
            }
        }
        else if(problem == 8){
            Glide.with(this).load(R.drawable.problem_8).into(problemView);
            problemText.setText("Problem 08");
            if(hint8){
                hintText.setText("#, #, X, X");
            }
        }
        else {

        }
    }

    public void onClick_answer_Button(View v){
        if(problem == 1) {
            if( answerText.getText().toString().equals("chestnut") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 2){
            if(answerText.getText().toString().equals("love") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 3){
            if(answerText.getText().toString().equals("7452") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 4){
            if(answerText.getText().toString().equals("luna") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 5){
            if(answerText.getText().toString().equals("2460") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 6){
            if(answerText.getText().toString().equals("4318") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 7){
            if(answerText.getText().toString().equals("nine") ){
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
        else if(problem == 8){
            if(answerText.getText().toString().equals("ground") ) {
                problem++;
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("problem", problem);
                editor.commit();
                Intent intent = new Intent(this, MonitorActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }

    public void onClick_exit_button(View v){
        Intent intent = new Intent(this, MonitorActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClick_hint_button(View v){
        if(problem == 1){
            if(hint1 == false) {
                MediaPlayer player = MediaPlayer.create(this, R.raw.crash);
                player.start();
                hint1 = true;
                hintText.setText("동음이의어");
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint1", hint1);
                editor.commit();
            }
        }
        else if(problem == 2){
            if(hint2 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.water);
                hint2 = true;
                hintText.setText("Keyboard");
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint2", hint2);
                editor.commit();
            }
        }
        else if(problem == 3){
            if(hint3 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.boom);
                hint3 = true;
                hintText.setText("신시 : 3시 ~ 5시");
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint3", hint3);
                editor.commit();
            }
        }
        else if(problem == 4){
            if(hint4 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.ropesound);
                hint4 = true;
                hintText.setText("한자");
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint4", hint4);
                editor.commit();
            }
        }
        else if(problem == 5){
            if(hint5 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.plumb);
                hint5 = true;
                hintText.setText("모든 단어는 상응하는 숫자가 있다.");
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint5", hint5);
                editor.commit();
            }
        }
        else if(problem == 6){
            if(hint6 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.scream);
                hint6 = true;
                hintText.setText("7 Segment Number");
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint6", hint6);
                editor.commit();
            }
        }
        else if(problem == 7){
            if(hint7 == false){
                MediaPlayer player = MediaPlayer.create(this, R.raw.bookshelf);
                MediaPlayer player1 = MediaPlayer.create(this, R.raw.gear);
                hint7 = true;
                hintText.setText("Palindrome");
                player1.start();
                player.start();
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint7", hint7);
                editor.commit();
            }
        }
        else if(problem == 8){
            if(hint8 == false){
                hint8 = true;
                hintText.setText("#, #, X, X");
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("hint8", hint8);
                editor.commit();
            }
        }
    }


    @Override
    public void onBackPressed(){

    }

}
