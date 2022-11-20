package com.example.prakpbp10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int image = getIntent().getIntExtra("Image", 0);
        String title = getIntent().getStringExtra("Title");
        String description = getIntent().getStringExtra("Description");

        ImageView movie_poster2 = findViewById(R.id.iv_movie_poster2);
        TextView movie_title2 = findViewById(R.id.tv_movie_title2);
        TextView movie_description2 = findViewById(R.id.tv_movie_description2);

        movie_poster2.setImageResource(image);
        movie_title2.setText(title);
        movie_description2.setText(description);
    }
}