package com.example.android.materialme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        TextView sporttitle = findViewById(R.id.titleDetail);
        ImageView sportImage = findViewById(R.id.sportsImageDetail);

        // colocamos texto que viene extra con intent
        sporttitle.setText(getIntent().getStringExtra("title"));

        // añadimos imagen con Glide
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).into(sportImage);

    }
}