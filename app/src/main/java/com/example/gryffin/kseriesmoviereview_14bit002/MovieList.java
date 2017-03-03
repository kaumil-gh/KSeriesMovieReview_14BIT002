package com.example.gryffin.kseriesmoviereview_14bit002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MovieList extends AppCompatActivity {

    String[] movieArray = {"Batman Begins","The Dark Knight","The Dark Knight Rises","Batman vs. Superman: Dawn of Justice",
            "Man of Steel","Suicide Squad","Wonder Woman","Justice League"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);


        ArrayAdapter listadapter = new ArrayAdapter<String>(this, R.layout.activity_listview, movieArray);

        ListView listView = (ListView) findViewById(R.id.fullmovielist);
        listView.setAdapter(listadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listadapter, View activity_movie_list, int position,
                                    long a) {
                Intent ilist;
                switch (position) {
                    case 0:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                    case 1:
                        ilist = new Intent(MovieList.this, TheDarkKnight.class);
                        startActivity(ilist);
                        break;
                    case 2:
                        ilist = new Intent(MovieList.this, TheDarkKnightRises.class);
                        startActivity(ilist);
                        break;
                    case 3:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                    case 4:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                    case 5:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                    case 6:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                    case 7:
                        ilist = new Intent(MovieList.this, BatmanBegins.class);
                        startActivity(ilist);
                        break;
                }
            }
        });

    }
}
