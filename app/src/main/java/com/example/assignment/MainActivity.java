package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment.model.Movie;
import com.example.assignment.model.adapter.MovieCustomerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView listView;
ArrayList<Movie> movies;

    public ArrayList<Movie> generateMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","The beginning"));
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","The beginning"));
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","The beginning"));
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","The beginning"));
        movies.add( new Movie ("Bahubali","Rating - 4.5/5","The beginning"));

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
