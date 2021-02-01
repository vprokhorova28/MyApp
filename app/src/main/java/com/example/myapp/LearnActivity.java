package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    private String englishLevel;
    private TextView tvQuestion, tvResult;
    private String[] answers, question;
    private Button btnA, btnThe, btnZero, btnPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        englishLevel = getIntent().getStringExtra("level");
        Task task = new Task();

        question = task.getQuestion();
        answers = task.getAnswers();

        setContentView(R.layout.activity_learn);
        tvQuestion = findViewById(R.id.tv_task);
        tvResult = findViewById(R.id.tv_result);

        btnA = findViewById(R.id.btn1);
        btnA.setOnClickListener(l);

        btnThe = findViewById(R.id.btn2);
        btnThe.setOnClickListener(l);

        btnZero = findViewById(R.id.btn3);
        btnZero.setOnClickListener(l);

        tvQuestion.setText(question[0]);

        btnA.setText(answers[0]);
        btnThe.setText(answers[1]);
        btnZero.setText(answers[2]);


    }

    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btnPressed = findViewById(v.getId());
            if (btnPressed.getText().toString().equals(question[1])){
                tvResult.setText("Верно");
            } else {
                tvResult.setText("Неверно");
            }
        }
    };


}