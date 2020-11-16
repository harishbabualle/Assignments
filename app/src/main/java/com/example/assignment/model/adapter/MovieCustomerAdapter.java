package com.example.assignment.model.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.assignment.R;
import com.example.assignment.model.Movie;

import java.util.ArrayList;

public class MovieCustomerAdapter extends BaseAdapter {


    ArrayList<Movie> movies;
    public Integer[] movieimages ={
            R.drawable.bahubali,
            R.drawable.fastandfurious,
            R.drawable.hitman,
            R.drawable.shakuntaladevi,
            R.drawable.war
    };
    private String[] imageLabels;
     private LayoutInflater thisInflater;

    public MovieCustomerAdapter(Context con, String[] labs)
    {
        this.thisInflater = LayoutInflater.from(con);
        this.imageLabels = labs;
    }

    public MovieCustomerAdapter(ArrayList<Movie> movies)
    {
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
       ViewHolder viewHolder;
       if(convertView == null)
       {
           convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, null);
           viewHolder = new ViewHolder(convertView);
           convertView.setTag(viewHolder);
       }
       else
       {
           viewHolder = (ViewHolder) convertView.getTag();
       }
       Movie movies = (Movie) getItem(position);
       //Movie movies = getItem(position);
       viewHolder.movietitle.setText(movies.getMovietitle());
        viewHolder.movierating.setText(movies.getMovierating());
       viewHolder.moviedescription.setText(movies.getMoviedescription());
       viewHolder.image.setImageResource(movieimages[position]);
    return convertView;

    }

    class ViewHolder{
        TextView movietitle;
        TextView movierating;
        TextView moviedescription;
        ImageView image;
        public ViewHolder(View view)
        {
            movietitle = (TextView) view.findViewById(R.id.movie_title);
            movierating =(TextView) view.findViewById(R.id.movie_rating);
            moviedescription = (TextView) view.findViewById(R.id.movie_description);
           image = (ImageView) view.findViewById(R.id.imageView2);
        }


    }
}
