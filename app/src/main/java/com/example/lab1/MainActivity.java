package com.example.lab1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        Intent intent = new Intent(this, ConvertActivity.class);
        startActivity(intent);
    }

    public void documentation(View view) {
        Intent intent = new Intent(this, DocumentationActivity.class);
        startActivity(intent);
    }

    public void exit(View view) {
        Intent intent = new Intent(this, ConvertActivity.class);
        startActivity(intent);
    }
}