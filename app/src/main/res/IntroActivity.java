package com.example.test;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    View view;
    int count = 0;
    String text[] = {"안녕하세요?","이건 테스트 메세지입니다.", "잘 됬으면 좋겠네요."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView3);
        textView.setText(text[count]);

        view = findViewById(R.id.imageView);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if(action == MotionEvent.ACTION_DOWN && count < 2){
                    count++;
                    textView.setText(text[count]);
                }
                return true;
            }
        });
    }
}
