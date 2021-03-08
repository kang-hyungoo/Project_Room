package com.example.project_room;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IntroActivity extends AppCompatActivity {
    TextView textView;

    View startView;
    Button skipButton;
    ImageView startintroView;
    int count = 0;
    String text[] = {"당신은 돈을 벌기 위해 일을 찾고 있었습니다.","그러던 중 재밌어 보이는 일을 찾게 됩니다.", "그저 지정된 방에 들어가서", "그 방에서 탈출하기만 하면 되는 일", "당신은 흥미를 느끼고 그 일에 지원하게 됩니다."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_intro);

        textView = (TextView)findViewById(R.id.textView3);
        textView.setText(text[count]);
        skipButton = (Button)findViewById(R.id.skipButton);

        startintroView = findViewById(R.id.startIntroView);
        Glide.with(this).load(R.drawable.introstart).into(startintroView);

        startView = findViewById(R.id.startIntroView);
        startView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if(action == MotionEvent.ACTION_DOWN && count < 4){
                    if(count == 1)
                        image_change();
                    count++;
                    textView.setText(text[count]);
                }
                else if(action ==MotionEvent.ACTION_DOWN && count == 4){
                    onClick_skip_button(v);
                }
                return true;
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        skipButton.setVisibility(View.VISIBLE);

    }

    public void onClick_skip_button(View v){
        skipButton.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
        startActivity(intent);
        finish();
    }

    public void image_change(){
        Glide.with(this).load(R.drawable.introend).into(startintroView);
    }

    @Override
    public void onBackPressed(){

    }
}
