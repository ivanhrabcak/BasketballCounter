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

    public PointLayout(Context context) {
        super(context);
        inflate(context, R.layout.point_layout, this);
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.point_layout, this);
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.point_layout, this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PointLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflate(context, R.layout.point_layout, this);
    }
}