package com.example.myflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.question_text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.anwer_to_question_text_view).setVisibility(View.VISIBLE);
                findViewById(R.id.question_text_view).setVisibility(View.INVISIBLE);
            }
        });

    }
}

