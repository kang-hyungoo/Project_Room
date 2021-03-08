package com.example.project_room;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class RoomActivity extends AppCompatActivity {

    int problem;

    boolean door_check;

    boolean card_key;

    ImageView room_View;

    ImageView letter_View;

    ImageView coffer_View;

    ImageView blood_View;

    ImageView machinery_View;

    ImageView doorlock_View;

    ImageView rope_View;

    ImageView water_View;

    ImageView plumb_View;

    ImageView bookshelf_vertical_View;

    ImageView bookshelf_down_View;

    ImageView monitor_View;

    ImageView letter_contents_View;

    Button door_button;

    boolean hint2;
    boolean hint4;
    boolean hint5;
    boolean hint7;
    boolean hint8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        room_View = (ImageView)findViewById(R.id.room);
        Glide.with(this).load(R.drawable.room_normal).into(room_View);

        monitor_View = (ImageView)findViewById(R.id.activated_monitor);
        Glide.with(this).load(R.drawable.activated_monitor).into(monitor_View);

        bookshelf_vertical_View = (ImageView)findViewById(R.id.bookshelf);
        Glide.with(this).load(R.drawable.bookshelf_vertical).into(bookshelf_vertical_View);

        rope_View = (ImageView)findViewById(R.id.rope);
        Glide.with(this).load(R.drawable.rope).into(rope_View);

        doorlock_View = (ImageView)findViewById(R.id.doorlock);
        Glide.with(this).load(R.drawable.doorlock).into(doorlock_View);

        coffer_View = (ImageView)findViewById(R.id.coffer);
        Glide.with(this).load(R.drawable.coffer).into(coffer_View);

        letter_View = (ImageView)findViewById(R.id.letter);
        Glide.with(this).load(R.drawable.letter).into(letter_View);

        machinery_View = (ImageView)findViewById(R.id.machinery);
        Glide.with(this).load(R.drawable.machinery).into(machinery_View);
        machinery_View.setVisibility(View.INVISIBLE);

        plumb_View = (ImageView)findViewById(R.id.plumb);
        Glide.with(this).load(R.drawable.plumb).into(plumb_View);
        plumb_View.setVisibility(View.INVISIBLE);

        blood_View = (ImageView)findViewById(R.id.blood);
        Glide.with(this).load(R.drawable.blood).into(blood_View);
        blood_View.setVisibility(View.INVISIBLE);

        bookshelf_down_View = (ImageView)findViewById(R.id.bookshelf_down);
        Glide.with(this).load(R.drawable.bookshelf_down).into(bookshelf_down_View);
        bookshelf_down_View.setVisibility(View.INVISIBLE);

        water_View = (ImageView)findViewById(R.id.water);
        Glide.with(this).load(R.drawable.water).into(water_View);

        letter_contents_View = (ImageView)findViewById(R.id.letter_contents);
        Glide.with(this).load(R.drawable.letter_contents).into(letter_contents_View);
        letter_contents_View.setVisibility(View.INVISIBLE);

        door_button = (Button)findViewById(R.id.door);
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);

        hint2 = pref.getBoolean("hint2", false);
        Log.d("hint2 ", "hint2 : " + hint2);

        hint4 = pref.getBoolean("hint4", false);
        Log.d("hint4 ", "hint4 : " + hint4);

        hint5 = pref.getBoolean("hint5", false);
        Log.d("hint5 ", "hint5 : " + hint5);

        hint7 = pref.getBoolean("hint7", false);
        Log.d("hint7 ", "hint7 : " + hint7);

        hint8 = pref.getBoolean("hint8", false);
        Log.d("hint8 ", "hint8 : " + hint8);

        problem = pref.getInt("problem", 1);

        door_check = pref.getBoolean("door_check", false);

        card_key = pref.getBoolean("card_key", false);
    }

    @Override
    protected void onResume(){
        super.onResume();
        if(hint2){
            water_View.setVisibility(View.VISIBLE);
        }
        else {
            water_View.setVisibility(View.INVISIBLE);
        }

        if(hint4){
            rope_View.setVisibility(View.INVISIBLE);
        }
        else {
            rope_View.setVisibility(View.VISIBLE);
        }

        if(hint5){
            plumb_View.setVisibility(View.VISIBLE);
        }
        else {
            plumb_View.setVisibility(View.INVISIBLE);
        }

        if(hint7){
            bookshelf_down_View.setVisibility(View.VISIBLE);
            bookshelf_vertical_View.setVisibility(View.INVISIBLE);
            machinery_View.setVisibility(View.VISIBLE);
        }
        else {
            bookshelf_down_View.setVisibility(View.INVISIBLE);
            bookshelf_vertical_View.setVisibility(View.VISIBLE);
            machinery_View.setVisibility(View.INVISIBLE);
        }

        if(hint8){
            blood_View.setVisibility(View.VISIBLE);
        }
        else {
            blood_View.setVisibility(View.INVISIBLE);
        }
    }

    public void onClick_door_button(View v)
    {
        if(door_check){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("방에서 나가겠습니까?");

            builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    End();
                }
            });

            builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "방에 남아있는다.", Toast.LENGTH_LONG).show();
                }
            });

            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else
            Toast.makeText(getApplicationContext(), "문이 잠겨있다.", Toast.LENGTH_LONG).show();
    }

    public void onClick_coffer_button(View v)
    {
        if(card_key){
            Toast.makeText(getApplicationContext(), "안이 비어있다.", Toast.LENGTH_LONG).show();
        }
        else if(card_key == false && problem < 5){
            Toast.makeText(getApplicationContext(), "금고가 잠겨있다.", Toast.LENGTH_LONG).show();
        }
        else if(card_key == false && problem > 4)
        {
            SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            card_key = true;
            editor.putBoolean("card_key", card_key);

            editor.commit();
            Toast.makeText(getApplicationContext(), "카드키를 획득했다.", Toast.LENGTH_LONG).show();
        }

    }

    public void onClick_door_lock_button(View v)
    {
        if(card_key && problem > 8){
            SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            door_check = true;
            editor.putBoolean("door_check", card_key);

            editor.commit();
            Toast.makeText(getApplicationContext(), "문이 열렸다.", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "문을 열 수 없다.", Toast.LENGTH_LONG).show();
        }
    }

    public void onClick_monitor_button(View v)
    {
        Intent intent = new Intent(this, MonitorActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }

    public void onClick_letter_button(View v)
    {
        letter_contents_View.setVisibility(View.VISIBLE);
        door_button.setVisibility(View.INVISIBLE);
        doorlock_View.setVisibility(View.INVISIBLE);
        monitor_View.setVisibility(View.INVISIBLE);
        coffer_View.setVisibility(View.INVISIBLE);
    }

    public void onClick_letter_contents_button(View v)
    {
        letter_contents_View.setVisibility(View.INVISIBLE);
        door_button.setVisibility(View.VISIBLE);
        doorlock_View.setVisibility(View.VISIBLE);
        monitor_View.setVisibility(View.VISIBLE);
        coffer_View.setVisibility(View.VISIBLE);
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("시작 화면으로 돌아가시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 RoomActivity.super.onBackPressed();
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void End(){
        Intent intent = new Intent(this, EndActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }
}
