package com.stepwisedesigns.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamA = 0;
    private int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayA(View view){
        TextView a = (TextView)  findViewById(R.id.score_textview_a);
        int id = a.getId();

        System.out.println("3333" +  "hello world");
        System.out.println(id);
    }

    public void takeAshot(View view){
        //add switch and pattern (as a parameters
        System.out.println(11111);
        int pointValue = 0;
        switch (2){
            case 1: pointValue = 1;
            freeThrow(pointValue);
            break;
            case 2: pointValue = 2;
            break;
            case 3: pointValue = 3;
            break;
        }

    }


    private int freeThrow(int score1Pts){

        score1Pts += 1;
        return score1Pts;

        //increase score
    }

    private int twoPointer(int score2Pts){

        score2Pts += 2;
        return teamA;
        //increase score

    }

    private int threePointer(int score3Pts){

        score3Pts += 3;

        return score3Pts;

        //increase score

    }

    public void addPoints(View view){

    }

    public void reseet(){

    }
}
