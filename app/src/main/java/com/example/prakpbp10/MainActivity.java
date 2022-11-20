package com.example.prakpbp10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DetailActivityInterface{
    private final ArrayList<Movie> listMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovies.addAll(MoviesData.getMovies());
        RecyclerView rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(listMovies, this);
        rvMovies.setAdapter(listMovieAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("Image", listMovies.get(position).getPosterImage());
        intent.putExtra("Title", listMovies.get(position).getTitle());
        intent.putExtra("Description", listMovies.get(position).getDescription());

        startActivity(intent);
    }
}