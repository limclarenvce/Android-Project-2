package com.example.asuspc.multiple_choice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ASUSPC on 7/21/2017.
 */

public class ResultsActivity extends AppCompatActivity{
    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultsactivity);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You have scored " + score + " out of " + QuestionLibrary.questions.length);

        if (score == 9){
            mGrade.setText("Bravo!");
        }else if (score == 8){
            mGrade.setText("Excellent!");
        }else if (score == 7) {
            mGrade.setText("Great!");
        }else {
            mGrade.setText("Try more harder next time");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }
}
