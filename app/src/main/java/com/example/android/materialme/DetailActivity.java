package com.example.android.materialme;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView sportsImageDetail = findViewById(R.id.sportsImageDetail);
        TextView titleDetail = findViewById(R.id.titleDetail);
        TextView subTitleDetail = findViewById(R.id.subTitleDetail);

        String title = getIntent().getStringExtra("title");
        int imageResource = getIntent().getIntExtra("image_resource", 0);

        titleDetail.setText(title);
        Glide.with(this).load(imageResource).into(sportsImageDetail);
    }
}
