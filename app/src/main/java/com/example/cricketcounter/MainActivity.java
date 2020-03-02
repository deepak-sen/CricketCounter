package com.example.cricketcounter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamARun;
    private int teamAWicket;
    private int teamBRun;
    private int teamBWicket;
    private int matchOver;

    private TextView textViewTeamAR;
    private TextView textViewTeamAW;
    private TextView textViewTeamBR;
    private TextView textViewTeamBW;
    private TextView textViewO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTeamAR = findViewById(R.id.team_a_run);
        textViewTeamAW = findViewById(R.id.team_a_wicket);
        textViewTeamBR = findViewById(R.id.team_b_run);
        textViewTeamBW = findViewById(R.id.team_b_wicket);
        textViewO = findViewById(R.id.match_over);


    }


    public void displayRunForTeamA(int run){
        textViewTeamAR.setText(String.valueOf(run));
    }
    public void displayWicketForTeamA(int wicket){
        textViewTeamAW.setText(String.valueOf(wicket));
    }
    public void displayRunForTeamB(int run){
        textViewTeamBR.setText(String.valueOf(run));
    }
    public void displayWicketForTeamB(int wicket){
        textViewTeamBW.setText(String.valueOf(wicket));
    }

    public void displayOver(int over){
        textViewO.setText(String.valueOf(over));
    }
    public void resetScore(View view)
    {
        teamARun = 0;
        teamAWicket = 0;
        teamBRun = 0;
        teamBWicket = 0;
        matchOver = 0;
        displayRunForTeamA(teamARun);
        displayWicketForTeamA(teamAWicket);
        displayRunForTeamB(teamBRun);
        displayWicketForTeamB(teamBWicket);
        displayOver(matchOver);
    }

//    For team A
    public void add3ForTeamA(View view){
        teamARun = teamARun +3;
        displayRunForTeamA(teamARun);

    }

    public void add2ForTeamA(View view) {
        teamARun = teamARun +2;
        displayRunForTeamA(teamARun);
    }

    public void add1ForTeamA(View view) {
        teamARun = teamARun +1;
        displayRunForTeamA(teamARun);
    }
    public void add4ForTeamA(View view) {
        teamARun = teamARun +4;
        displayRunForTeamA(teamARun);
    }

    public void add6ForTeamA(View view) {
        teamARun = teamARun +6;
        displayRunForTeamA(teamARun);
    }
    public void add1WicketTeamA(View view) {
        if (teamAWicket<=8) {
            teamAWicket = teamAWicket +1;
            displayWicketForTeamA(teamAWicket);
        }
    }

//For team B

    public void add3ForTeamB(View view) {
        teamBRun = teamBRun +3;
        displayRunForTeamB(teamBRun);
    }

    public void add2ForTeamB(View view) {
        teamBRun = teamBRun +2;
        displayRunForTeamB(teamBRun);
    }


    public void add1ForTeamB(View view) {
        teamBRun = teamBRun +1;
        displayRunForTeamB(teamBRun);
    }
    public void add4ForTeamB(View view) {
        teamBRun = teamBRun +4;
        displayRunForTeamB(teamBRun);
    }
    public void add6ForTeamB(View view) {
        teamBRun = teamBRun +6;
        displayRunForTeamB(teamBRun);
    }
    public void add1WicketTeamB(View view) {
        if (teamBWicket<=8)
        {
            teamBWicket = teamBWicket +1;
            displayWicketForTeamB(teamBWicket);
        }
    }
    public void Over(View view) {
        matchOver = matchOver +1;
        displayOver(matchOver);
    }
}
