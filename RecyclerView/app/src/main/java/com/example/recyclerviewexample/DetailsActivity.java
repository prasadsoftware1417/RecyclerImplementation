package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.album_display);
        t3=findViewById(R.id.t1);
        t1=findViewById(R.id.t2);
        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
        t3.setText(getIntent().getStringExtra("name"));
        t1.setText(getIntent().getStringExtra("phone"));
    }
}
