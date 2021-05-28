package com.ashish.truecitizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button falseButton;
    private Button trueButton;
    private ImageButton nextButton;
    private TextView questionTextView;
    private int currentQuestionIndex=0;
    private Question[] questionBank=new Question[]{
            new Question(R.string.question_us_amendments,false),
            new Question(R.string.question_declaration,false)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Question question=new Question(R.string.question_declaration,true);
        falseButton=findViewById(R.id.false_button);
        trueButton=findViewById(R.id.true_button);
        nextButton=findViewById(R.id.next_Button);
        questionTextView=findViewById(R.id.answer_text_view);
        falseButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.false_button:
                Toast.makeText(MainActivity.this,"False",Toast.LENGTH_SHORT).show();
                break;

            case R.id.true_button:
                Toast.makeText(MainActivity.this,"True",Toast.LENGTH_SHORT).show();
                break;

            case R.id.next_Button:
                currentQuestionIndex=(currentQuestionIndex+1)%questionBank.length;
                Log.d("Current","onClick "+currentQuestionIndex);


        }

    }
}
