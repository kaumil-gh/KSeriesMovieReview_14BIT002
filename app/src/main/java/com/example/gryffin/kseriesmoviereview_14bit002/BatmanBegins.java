package com.example.gryffin.kseriesmoviereview_14bit002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BatmanBegins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman_begins);

        Button prev1 = (Button) findViewById(R.id.prev1);
        Button next1 = (Button) findViewById(R.id.next1);

        prev1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(BatmanBegins.this, TheDarkKnightRises.class);
                startActivity(i);
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent i = new Intent(BatmanBegins.this, TheDarkKnight.class);
                startActivity(i);
            }
        });
    }
}
