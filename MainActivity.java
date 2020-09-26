package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsForTeamB = 0;
    int foulsForTeamA = 0;
    int inningsForTeamA = 0;
    int inningsForTeamB = 0;
    int outsForTeamB = 0;
    int outsForTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A score.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B score.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }


    /**
     * Displays the given score for Team B fouls.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Fouls
     * Displays the given score for Team A fouls.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B balls.
     */
    public void displayInningsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ball);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B balls.
     */
    public void displayInningsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ball);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B balls.
     */
    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_strikes);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B balls.
     */
    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_strikes);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method is called when the restSCore is clicked.
     */
    public void restScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsForTeamA = 0;
        foulsForTeamB = 0;
        inningsForTeamA = 0;
        inningsForTeamB = 0;
        outsForTeamB = 0;
        outsForTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulsForTeamA);
        displayFoulsForTeamB(foulsForTeamB);
        displayInningsForTeamA(inningsForTeamA);
        displayInningsForTeamB(inningsForTeamB);
        displayOutsForTeamA(outsForTeamA);
        displayOutsForTeamB(outsForTeamB);


    }


    /**
     * This method is called when the Free Throw button is clicked.
     */
    public void runsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);


    }


    /**
     * This method is called when the Free Throw button is clicked. Team B
     */
    public void runsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the fouls button is clicked. Team A
     */
    public void foulsForTeamA(View view) {
        foulsForTeamA = foulsForTeamA + 1;
        displayFoulsForTeamA(foulsForTeamA);


    }

    /**
     * This method is called when the fouls button is clicked. Team B
     */
    public void foulsForTeamB(View view) {
        foulsForTeamB = foulsForTeamB + 1;
        displayFoulsForTeamB(foulsForTeamB);


    }

    /**
     * This method is called when the innings button is clicked for team A.
     */
    public void inningsForTeamA(View view) {
        if (inningsForTeamA >= 9) {
            inningsForTeamA = 0;
        } else {
            inningsForTeamA = inningsForTeamA + 1;
        }
        displayInningsForTeamA(inningsForTeamA);


    }

    /**
     * This method is called when the innings button is clicked for team B.
     */
    public void inningsForTeamB(View view) {
        if (inningsForTeamB >= 9) {
            inningsForTeamB = 0;
        } else {
            inningsForTeamB = inningsForTeamB + 1;
        }
        displayInningsForTeamB(inningsForTeamB);


    }

    /**
     * This method is called when the outs button is clicked for team B.
     */
    public void outsForTeamB(View view) {

        if (outsForTeamB >= 3) {
            outsForTeamB = 0;
        } else {
            outsForTeamB = outsForTeamB + 1;
        }
        displayOutsForTeamB(outsForTeamB);
    }

    /**
     * This method is called when the outs button is clicked for team A.
     */
    public void outsForTeamA(View view) {
        if (outsForTeamA >= 3) {
            outsForTeamA = 0;
        } else {
            outsForTeamA = outsForTeamA + 1;
        }
        displayOutsForTeamA(outsForTeamA);

    }
}