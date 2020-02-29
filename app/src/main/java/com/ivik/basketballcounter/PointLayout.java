package com.ivik.basketballcounter;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class PointLayout extends LinearLayout {
    private int pointsA;
    private int pointsB;
    private View view1;
    private View view2;
    private String teamName1;
    private String teamName2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    public PointLayout(Context context) throws Exception {
        super(context);
        inflate(context, R.layout.point_layout, this);
//        init();
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs) throws Exception {
        super(context, attrs);
        inflate(context, R.layout.point_layout,this);
//        init();
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) throws Exception {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.point_layout,this);
//        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PointLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) throws Exception {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflate(context, R.layout.point_layout,this);
//        init();
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onButtonClick(String teamName) {
        if (teamName.equals(teamName1)) {
            pointsA++;
        }
        else if (teamName.equals(teamName2)) {
            pointsB++;
        }
        else {
            return;
        }
    }

    public void init() throws Exception {
        setFocusable(true);
        pointsA = 0;
        pointsB = 0;

        teamName1 = "Team 1";
        teamName2 = "Team 2";

        view1 = findViewById(R.id.team1point_view);
        view2 = findViewById(R.id.team2point_view);

        if (view1 == null) {
            throw new Exception("view1 == null");
        }

        if (view2 == null) {
            throw new Exception("view2 == null");
        }

        textView1 = view1.findViewById(R.id.textView);
        textView2 = view1.findViewById(R.id.textView1);

        textView3 = view2.findViewById(R.id.textView);
        textView4 = view2.findViewById(R.id.textView1);

        // Team 1
        button1 = view1.findViewById(R.id.btn1);                 // +1 point
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName1);
            }
        });
        button2 = view1.findViewById(R.id.btn2);                  // +2 points
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName1);
            }
        });
        button3 = view1.findViewById(R.id.btn3);                  // +3 points
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName1);
            }
        });

        // Team 2
        button4 = view2.findViewById(R.id.btn1);                  // +1 point
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName2);
            }
        });
        button5 = view2.findViewById(R.id.btn2);                  // +2 points
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName2);
            }
        });
        button6 = view2.findViewById(R.id.btn3);                  // +3 points
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(teamName2);
            }
        });

        textView1.setText(teamName1);
        textView2.setText(pointsA);

        textView3.setText(String.valueOf(teamName2));
        textView4.setText(String.valueOf(pointsB));
    }
}
