package com.ivik.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private String teamName1 = "Team 1";
    private String teamName2 = "Team 2";
    private int pointsA = 0;
    private int pointsB = 0;
    private LinearLayout layout;
    private PointLayout team1View;
    private PointLayout team2View;
    private int previousA;
    private int previousB;






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

        TextView textView1 = team1View.findViewById(R.id.textView);
        TextView textView2 = team2View.findViewById(R.id.textView);

        textView1.setText("Team 1");
        textView2.setText("Team 2");


//        Button backButton1 = team1View.findViewById(R.id.backbtn);
//        backButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                pointsA -= previousA;
//                tv.setText(pointsA);
//                previousA = 0;
//            }
//        });
//
//        Button backButton2 = findViewById(R.id.backbtn);
//        backButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                pointsB -= previousB;
//                TextView ttv = team1View.findViewById(R.id.textView1);
//                ttv.setText(String.valueOf(pointsB));
//                previousB = 0;
//            }
//        });
    }
}
