package com.example.hw1moxy.recycler.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw1moxy.R;
import com.example.hw1moxy.recycler.presenter.RecPresenter;

import java.util.ArrayList;

public class RecyclActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    RecPresenter recPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_act);
        recPresenter = new RecPresenter();

        ArrayList<Foto> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(new Foto());
        }

        initRecycleFav(list);

    }

    private void initRecycleFav(ArrayList<Foto> list) {
        recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        Adapter cityAdapter = new Adapter(list, recPresenter);
        recyclerView.setAdapter(cityAdapter);
    }
}