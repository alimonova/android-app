package com.example.lab1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class ConvertActivity extends AppCompatActivity {

    TextView textView;
    ImageView iv;
    int counter;
    String[] measures = {"наносекунда", "микросекунда", "секунда", "минута", "час", "сутки", "неделя", "год"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_convertation);
        Spinner spinner_from = (Spinner) findViewById(R.id.spinner_from);
        Spinner spinner_to = (Spinner) findViewById(R.id.spinner_to);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, measures);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_from.setAdapter(adapter);
        spinner_to.setAdapter(adapter);

/*
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
        setContentView(sv);*/
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        switch(id){
            case R.id.convert:
                intent = new Intent(this, ConvertActivity.class);
                startActivity(intent);
                return true;
            case R.id.document:
                intent = new Intent(this, DocumentationActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}