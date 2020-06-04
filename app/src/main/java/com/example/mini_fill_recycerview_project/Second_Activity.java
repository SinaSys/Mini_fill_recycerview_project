package com.example.mini_fill_recycerview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class Second_Activity extends AppCompatActivity {

    private CityAdapter adapter;
    private RecyclerView recyclerView;

    private BottomSheetBehavior mBottomSheetBehavior;
    private TextView mTextViewState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new CityAdapter(City_Generator.getDate(),this);

        recyclerView.setLayoutManager(new LinearLayoutManager(Second_Activity.this));
        recyclerView.setAdapter(adapter);


        View bottomSheet = findViewById(R.id.bottom_sheet);

        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);



    }
}
