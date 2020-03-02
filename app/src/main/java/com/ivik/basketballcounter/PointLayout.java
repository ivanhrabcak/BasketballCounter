package com.ivik.basketballcounter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class PointLayout extends LinearLayout {
    private int points;
    private View view;
    private List<Integer> history;

    private void backButtonClicked() {
        if (history.size() == 0) {
            return;
        }
        points -= history.get(history.size() - 1);
        history.remove(history.size() - 1);

        TextView tv = findViewById(R.id.textView1);
        tv.setText(String.valueOf(points));
    }

    private void buttonClicked(int step) {
        history.add(step);
        points += step;

        TextView tv = findViewById(R.id.textView1);

        tv.setText(String.valueOf(points));
    }

    private void changeTeamNamePopup(Context context) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);

        alert.setTitle("Change team name:");
        alert.setMessage("New team name:");

        final EditText input = new EditText(context);
        alert.setView(input);

        alert.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                TextView tv = view.findViewById(R.id.textView);

                tv.setText(input.getText().toString());
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                return;
            }
        });
        alert.show();
    }

    public PointLayout(Context context) {
        super(context);
        inflate(context, R.layout.point_layout, this);
        init();
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.point_layout, this);
        init();
    }

    public PointLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.point_layout, this);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PointLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        inflate(context, R.layout.point_layout, this);
        init();
    }

    public void init() {
        history = new ArrayList<>();
        points = 0;
        view = findViewById(R.id.teampoint_view);

        Button button1 = view.findViewById(R.id.btn1);                 // +1 point
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(1);
            }
        });

        Button button2 = view.findViewById(R.id.btn2);                  // +2 points
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(2);
            }
        });

        Button button3 = view.findViewById(R.id.btn3);                  // +3 points
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(3);
            }
        });

        Button button4 = view.findViewById(R.id.backbtn);
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                backButtonClicked();
            }
        });

        TextView textView = view.findViewById(R.id.textView);
        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTeamNamePopup(getContext());
            }
        });

    }
}