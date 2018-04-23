package com.example.rm.recyclerview2;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    View layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeopleMock peopleMock = new PeopleMock(this);
        List<People> peopleList = new ArrayList<>();
        peopleList.addAll(peopleMock.getList());

        RecyclerView rv_people = (RecyclerView) findViewById(R.id.rv_people_list);
        rv_people.setLayoutManager(new LinearLayoutManager(this));

        PessoaAdapter adapter = new PessoaAdapter(peopleList);
        rv_people.setAdapter(adapter);






    }




}
