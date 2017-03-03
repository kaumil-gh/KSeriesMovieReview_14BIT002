package com.example.gryffin.kseriesmoviereview_14bit002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheDarkKnightRises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_dark_knight_rises);

        Button prev3 = (Button) findViewById(R.id.prev3);
        Button next3 = (Button) findViewById(R.id.next3);

        prev3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(TheDarkKnightRises.this, TheDarkKnight.class);
                startActivity(i);
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(TheDarkKnightRises.this, BatmanBegins.class);
                startActivity(i);
            }
        });
    }
}
