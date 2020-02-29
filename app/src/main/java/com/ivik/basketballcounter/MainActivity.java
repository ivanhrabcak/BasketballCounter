package com.ivik.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String teamName1 = "Team 1";
    private String teamName2 = "Team 2";
    private int pointsA = 0;
    private int pointsB = 0;


    private void ButtonClicked(String teamName, int step) {
        if (teamName == teamName1) {
            pointsA += step;
        }
        else if (teamName == teamName2) {
            pointsB += step;
        }
        LinearLayout view1 = findViewById(R.id.team1point_view);
        TextView tv = view1.findViewById(R.id.textView1);

        LinearLayout view2 = findViewById(R.id.team2point_view);
        TextView tv2 = view2.findViewById(R.id.textView1);

        tv.setText(String.valueOf(pointsA));
        tv2.setText(String.valueOf(pointsB));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout view = findViewById(R.id.team1point_view);
        TextView tv = view.findViewById(R.id.textView);
        tv.setText("Team 1");

        LinearLayout view1 = findViewById(R.id.team2point_view);
        TextView tv1 = view1.findViewById(R.id.textView);
        tv1.setText("Team 2");

        Button button1 = view.findViewById(R.id.btn1);                 // +1 point
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 1);
            }
        });
        Button button2 = view.findViewById(R.id.btn2);                  // +2 points
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 2);
            }
        });
        Button button3 = view.findViewById(R.id.btn3);                  // +3 points
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName1, 3);
            }
        });

        Button button4 = view1.findViewById(R.id.btn1);                 // +1 point
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 1);
            }
        });
        Button button5 = view1.findViewById(R.id.btn2);                  // +2 points
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 2);
            }
        });
        Button button6 = view1.findViewById(R.id.btn3);                  // +3 points
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClicked(teamName2, 3);
            }
        });
    }
}
