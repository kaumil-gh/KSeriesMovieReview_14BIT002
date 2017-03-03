package com.example.gryffin.kseriesmoviereview_14bit002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheDarkKnight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_dark_knight);

        Button prev2 = (Button) findViewById(R.id.prev2);
        Button next2 = (Button) findViewById(R.id.next2);

        prev2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(TheDarkKnight.this, BatmanBegins.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(TheDarkKnight.this, TheDarkKnightRises.class);
                startActivity(i);
            }
        });
    }
}
