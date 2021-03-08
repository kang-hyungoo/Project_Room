package com.example.project_room;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Random;

public class EndActivity extends AppCompatActivity {

    boolean hint1;
    boolean hint2;
    boolean hint3;
    boolean hint4;
    boolean hint5;
    boolean hint6;
    boolean hint7;
    boolean hint8;

    int count = 0;
    int check_case[] = new int[8];
    Random random_case = new Random();
    int random;
    ImageView tape1View;
    ImageView tape2View;
    ImageView tape3View;
    ImageView tape4View;
    ImageView tape5View;
    ImageView tape6View;
    ImageView tape7View;
    ImageView tape8View;
    ImageView BoxView;
    ImageView deskView;

    ImageButton moneyButton;
    ImageButton deskLetterButton;
    ImageButton letterButton;

    Button game_end_Button;

    TextView letterText;
    TextView endStartText;
    TextView endEndingText;
    String caseString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);

        hint1 = pref.getBoolean("hint1", false);

        hint2 = pref.getBoolean("hint2", false);

        hint3 = pref.getBoolean("hint3", false);

        hint4 = pref.getBoolean("hint4", false);

        hint5 = pref.getBoolean("hint5", false);

        hint6 = pref.getBoolean("hint6", false);

        hint7 = pref.getBoolean("hint7", false);

        hint8 = pref.getBoolean("hint8", false);

        deskView = (ImageView)findViewById(R.id.deskView);
        Glide.with(this).load(R.drawable.desk).into(deskView);

        BoxView = (ImageView)findViewById(R.id.BoxView);
        Glide.with(this).load(R.drawable.desk_box).into(BoxView);

        tape1View = (ImageView)findViewById(R.id.tape1View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape1View);

        tape2View = (ImageView)findViewById(R.id.tape2View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape2View);

        tape3View = (ImageView)findViewById(R.id.tape3View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape3View);

        tape4View = (ImageView)findViewById(R.id.tape4View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape4View);

        tape5View = (ImageView)findViewById(R.id.tape5View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape5View);

        tape6View = (ImageView)findViewById(R.id.tape6View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape6View);

        tape7View = (ImageView)findViewById(R.id.tape7View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape7View);

        tape8View = (ImageView)findViewById(R.id.tape8View);
        Glide.with(this).load(R.drawable.desk_tape_prefab).into(tape8View);

        moneyButton = (ImageButton)findViewById(R.id.moneyButton);
        Glide.with(this).load(R.drawable.money).into(moneyButton);

        deskLetterButton = (ImageButton)findViewById(R.id.deskLetterButton);
        Glide.with(this).load(R.drawable.desk_letter).into(deskLetterButton);

        letterButton = (ImageButton)findViewById(R.id.letterButton);

        letterText = (TextView)findViewById(R.id.letterText);
        letterText.setVisibility(View.INVISIBLE);

        game_end_Button = (Button)findViewById(R.id.game_end_button);
        game_end_Button.setVisibility(View.INVISIBLE);

        endEndingText = findViewById(R.id.endEndingView);
        endEndingText.setVisibility(View.INVISIBLE);

        endStartText = findViewById(R.id.endStartView);
        game_end_Button.setVisibility(View.INVISIBLE);

        endStartText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if(action == MotionEvent.ACTION_DOWN){
                    endStartText.setVisibility(View.INVISIBLE);
                }
                return true;
            }
        });

        if(hint1){
            tape1View.setVisibility(View.VISIBLE);
            check_case[count] = 0;
            count++;
        }
        else{
            tape1View.setVisibility(View.INVISIBLE);
        }

        if(hint2){
            tape2View.setVisibility(View.VISIBLE);
            check_case[count] = 1;
            count++;
        }
        else{
            tape2View.setVisibility(View.INVISIBLE);
        }

        if(hint3){
            tape3View.setVisibility(View.VISIBLE);
            check_case[count] = 2;
            count++;
        }
        else{
            tape3View.setVisibility(View.INVISIBLE);
        }

        if(hint4){
            tape4View.setVisibility(View.VISIBLE);
            check_case[count] = 3;
            count++;
        }
        else{
            tape4View.setVisibility(View.INVISIBLE);
        }

        if(hint5){
            tape5View.setVisibility(View.VISIBLE);
            check_case[count] = 4;
            count++;
        }
        else{
            tape5View.setVisibility(View.INVISIBLE);
        }

        if(hint6){
            tape6View.setVisibility(View.VISIBLE);
            check_case[count] = 5;
            count++;
        }
        else{
            tape6View.setVisibility(View.INVISIBLE);
        }

        if(hint7){
            tape7View.setVisibility(View.VISIBLE);
            check_case[count] = 6;
            count++;
        }
        else{
            tape7View.setVisibility(View.INVISIBLE);
        }

        if(hint8){
            tape8View.setVisibility(View.VISIBLE);
            check_case[count] = 7;
            count++;
        }
        else{
            tape8View.setVisibility(View.INVISIBLE);
        }

        if(count == 0){
            Glide.with(this).load(R.drawable.letter_result_nojam).into(letterButton);
            letterButton.setVisibility(View.INVISIBLE);
        }
        else {
            Glide.with(this).load(R.drawable.letter_result_background).into(letterButton);
            letterButton.setVisibility(View.INVISIBLE);

            random = random_case.nextInt(count);

            if(check_case[random] == 0){
                caseString = "사람이 줄에 목을 걸어 죽는 사람을 본 적 있어? 몸부림치다가 축 늘어져버렸을때는 웃어버리고 말았다니까? 너가 1번째 힌트를 눌러 준 덕분에 좋은 구경을 했어.\n";
            }
            else if(check_case[random] == 1){
                caseString = "물 속에 빠진 사람을 본 적 있어? 살기 위해서 발버둥 치는 모습이 참 재밌더라고 아마 너가 2번째 힌트를 눌렀을 때쯤일 거야.\n";
            }
            else if(check_case[random] == 2){
                caseString = "중간에 큰 소리가 났었지? 너가 3번째 힌트를 눌렀을 땐데 기억나? 그 소리는 폭탄이 터지는 소리였는데 아쉽게 한 번에 죽어버려서 별로 재미 없었어.\n";
            }
            else if(check_case[random] == 3){
                caseString = "사람이 높은 곳에서 떨어질때 어떤 표정을 짓는 줄 알아? 그 표정을 한번이라도 보면 이 짓을 끊을 수가 없다니까 내가 제일 좋아하는 표정인데 너가 4번째 힌트를 눌러준 덕분에 좋은 표정을 구했어.\n";
            }
            else if(check_case[random] == 4){
                caseString = "예전에 사형을 할 때 쓰던 단두대라는게 있잖아? 그 도구로 처형되는 사람은 처음엔 시끄럽더니 마지막에 가서는 체념해버리더라고 그 사람은 너가 5번 힌트를 눌러준 덕분에 몸과 머리가 분리됬어!\n";
            }
            else if(check_case[random] == 5){
                caseString = "오체분시란 게 어떤건지 궁금했었는데 네 덕분에 궁금증이 해결됬어. 6번째 힌트였나? 그걸 눌러준 덕분이야 고마워!\n";
            }
            else if(check_case[random] == 6){
                caseString = "네가 누른 7번째 힌트 버튼은 영화에서 점점 좁아지는 방이 있잖아? 그걸 한번 해보려고 했었는데 실수해버렸어. 완벽하게 안 줄어들고 조금 남아버렸다니까.\n";
            }
            else if(check_case[random] == 7){
                caseString = "사람의 몸은 70퍼센트가 물로 이뤄져 있다고들 하잖아? 그 물을 몸에서 다 빼버리면 어떻게 될까 궁금했었는데 네가 8번째 힌트를 눌러준 덕분에 궁금증이 해결됬어.\n";
            }



            letterText.setText("안녕! 정말 고마워!\n" +
                    "사실 너가 누른 힌트 버튼에는 비밀이 있었어.\n" +
                    "그 버튼을 누르면 장치가 작동하게 되는 거야!\n" +
                    "장치가 작동되면 어떻게 되는지 궁금하지?\n" +
                    "별 거 아니야 누군가 한명이 죽을 뿐이야ㅋ\n" +
                    "너가 총 " + count +"번 버튼을 눌렀으니\n" +
                    "고작" + count + "명이 죽었을 뿐이야.\n" +
                    caseString +
                    "너 덕분에 좋은 영상을 많이 구할 수 있었어.\n" +
                    "전부 네 덕분이야! 그럼 잘 가!");
        }
    }


    public void onClick_money_button(View v){
        Toast.makeText(getApplicationContext(), "400만원을 챙겼다.", Toast.LENGTH_LONG).show();
        moneyButton.setVisibility(View.INVISIBLE);
    }

    public void onClick_deskLetterButton(View v){
        game_end_Button.setVisibility(View.INVISIBLE);
        letterButton.setVisibility(View.VISIBLE);
        if(count > 0)
            letterText.setVisibility(View.VISIBLE);
    }

    public void onClick_letterButton(View v){
        game_end_Button.setVisibility(View.VISIBLE);
        letterButton.setVisibility(View.INVISIBLE);
        if(count > 0)
            letterText.setVisibility(View.INVISIBLE);
    }


    public void onClick_game_end_Button(View v){
        if(count > 0) {
            MediaPlayer player = MediaPlayer.create(this, R.raw.end);
            player.start();
            endEndingText.setVisibility(View.VISIBLE);
            game_end_Button.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), Game_End_Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                    finish();
                }
            },3000);
        }
        else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent. FLAG_ACTIVITY_SINGLE_TOP );
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onBackPressed(){

    }
}
