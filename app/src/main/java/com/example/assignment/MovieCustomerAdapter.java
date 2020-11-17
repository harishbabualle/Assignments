package com.example.assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment.R;
import com.example.assignment.model.Movie;

import java.util.ArrayList;

class MovieCustomerAdapter extends BaseAdapter {

    ArrayList<Movie> movies;
    private Integer[ ] movieimages = {R.mipmap.bahubali,
            R.mipmap.fastandfurious,
            R.mipmap.hitman,
            R.mipmap.shakuntaladevi,
            R.mipmap.war
    };
    TextView movietitle;
    TextView movieratings;
    TextView moviedescription;
    ImageView imageView;

    public MovieCustomerAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,null);



        movietitle = convertView.findViewById(R.id.movie_title);
        movieratings = convertView.findViewById(R.id.movie_rating);
        moviedescription = convertView.findViewById(R.id.movie_description);
        imageView = convertView.findViewById(R.id.imageView2);

        Movie movies = (Movie) getItem(position);
        movietitle.setText(movies.getMovietitle());
        movieratings.setText(movies.getMovierating());
        moviedescription.setText(movies.getMoviedescription());
        imageView.setImageResource(movieimages[position]);
        return convertView;
    }
}