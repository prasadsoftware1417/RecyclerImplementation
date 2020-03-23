package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import static androidx.recyclerview.widget.RecyclerView.VERTICAL;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
            R.drawable.img11};

    String[] name = {"ravi","pratik","sunny","shivani","abhishek","abhi","shubham","chetan","tushar","sami","Shweta"};

    String[] phone = {"8830717094","8830717094","7769088370","8830717094","8830717094","8830717094","7769088370","8830717094","8830717094","8830717094","7769088370"};

    String[] date = {"03/12/2019","18/01/2020","03/12/2019","18/01/2020","03/12/2019","18/01/2020","03/12/2019","18/01/2020","03/12/2019","18/01/2020","18/01/2020"};

    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this, VERTICAL, false);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images,name,phone,date,this);
        recyclerView.setAdapter(adapter);
    }
}
