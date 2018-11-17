package com.example.harsh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int ascore=0,bscore=0;
    public void a3pt(View view) {
        ascore=ascore+3;
        updatea(ascore);
    }
    public void a2pt(View view) {
        ascore=ascore+2;
        updatea(ascore);
    }
    public void a1pt(View view) {
        ascore=ascore+1;
        updatea(ascore);
    }
    public void b3pt(View view) {
        bscore=bscore+3;
        updateb(bscore);
    }
    public void b2pt(View view) {
        bscore=bscore+2;
        updateb(bscore);
    }
    public void b1pt(View view) {
        bscore=bscore+1;
        updateb(bscore);
    }
    public void reset(View view) {
        ascore=0;
        bscore=0;
        updatea(ascore);
        updateb(bscore);
    }
    public void updatea(int ascore) {
        TextView atextview = (TextView) findViewById(R.id.teamascore);
        atextview.setText(" " + ascore);
    }
    public void updateb(int bscore) {
        TextView btextview = (TextView) findViewById(R.id.teambscore);
        btextview.setText(" " + bscore);
    }
}
