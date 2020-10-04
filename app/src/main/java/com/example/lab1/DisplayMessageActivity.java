package com.example.lab1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView textView;
    ImageView iv;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = "Привет, " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE) + "!\nХочешь мем?";

        ScrollView sv = new ScrollView(this);
        counter = 0;
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.CENTER_HORIZONTAL);
        ll.setGravity(Gravity.CENTER_VERTICAL);

        textView = new TextView(this);
        textView.setTextSize(40);
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setText(message);

        LinearLayout ll2 = new LinearLayout(this);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        ll2.setGravity(Gravity.CENTER_HORIZONTAL);

        iv = new ImageView(this);
        Button buttonGood = new Button(this);
        buttonGood.setText("Да");
        buttonGood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                counter++;
                switch (counter) {
                    case 1: iv.setImageResource(R.drawable.mem1); break;
                    case 2: iv.setImageResource(R.drawable.mem2); break;
                    case 3: iv.setImageResource(R.drawable.mem3); counter = 0; break;
                }
            }
        });

        ll.addView(textView);

        Button buttonBad = new Button(this);
        buttonBad.setText("Нет");
        buttonBad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                iv.setImageResource(R.drawable.not_mem);
            }
        });

        ll2.addView(buttonGood);
        ll2.addView(buttonBad);

        ll.addView(ll2);
        ll.addView(iv);
        sv.addView(ll);
        setContentView(sv);

    }
}