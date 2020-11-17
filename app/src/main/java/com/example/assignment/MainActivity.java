package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment.model.Movie;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView listView;
ArrayList<Movie> movies;

    public ArrayList<Movie> generateMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","Baahubali: The Beginning is a 2015 Indian epic action film."));
        movies.add( new Movie ("Fast and Furious","Rating - 4.0/5","The Fate of the Furious (alternatively known as F8 and Fast & Furious 8) is a 2017 American action film."));
        movies.add( new Movie ("Hitman","Rating - 3.5/5","Apparently, the agent in the game is one of the 47th generation of clones."));
        movies.add( new Movie ("Shakuntaladevi","Rating - 4.0/5","The film stars Vidya Balan as Shakuntala Devi, who was also known as the human computer"));
        movies.add( new Movie ("War","Rating - 3.0/5","War is a 2019 Indian Hindi-language action thriller film"));

        return movies;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listView = (ListView) findViewById(R.id.listView);
        movies = generateMovies();
        MovieCustomerAdapter adapter = new MovieCustomerAdapter(movies);
        listView.setAdapter(adapter);
    }
}
