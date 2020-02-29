package com.ivik.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String teamName1 = "Team 1";
    private String teamName2 = "Team 2";
    private int pointsA = 0;
    private int pointsB = 0;
    private LinearLayout layout;
    private PointLayout team1View;
    private PointLayout team2View;


    private void ButtonClicked(String teamName, int step) {
        if (teamName == teamName1) {
            pointsA += step;
        }
        else if (teamName == teamName2) {
            pointsB += step;
        }

        TextView tv = team1View.findViewById(R.id.textView1);

        TextView tv2 = team2View.findViewById(R.id.textView1);

        tv.setText(String.valueOf(pointsA));
        tv2.setText(String.valueOf(pointsB));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.main_layout);
        team1View = new PointLayout(this);
        team2View = new PointLayout(this);

        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout separator = (LinearLayout) inflater.inflate(R.layout.separator , null, false);

        layout.addView(team1View);
        layout.addView(separator);
        layout.addView(team2View);

        TextView tv = team1View.findViewById(R.id.textView);
        tv.setText("Team 1");

        TextView tv1 = team2View.findViewById(R.id.textView);
        tv1.setText("Team 2");

        Button button1 = team1View.findViewById(R.id.btn1);                 // +1 point
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 1);
            }
        });
        Button button2 = team1View.findViewById(R.id.btn2);                  // +2 points
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 2);
            }
        });
        Button button3 = team1View.findViewById(R.id.btn3);                  // +3 points
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 3);
            }
        });

        Button button4 = team2View.findViewById(R.id.btn1);                 // +1 point
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 1);
            }
        });
        Button button5 = team2View.findViewById(R.id.btn2);                  // +2 points
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 2);
            }
        });
        Button button6 = team2View.findViewById(R.id.btn3);                  // +3 points
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 3);
            }
        });
    }
}
