package com.example.tmh.demorecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mListHero;
    private AdapterHero mAdapter;
    private RecyclerView mRecycle;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
        mRecycle = (RecyclerView) findViewById(R.id.recycleview_hero);
        mRecycle.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycle.setLayoutManager(layoutManager);
        mAdapter = new AdapterHero(mListHero, this);
        mRecycle.setAdapter(mAdapter);
    }

    public void fakeData() {
        mListHero = new ArrayList<>();
        Hero mHero2 = new Hero(R.drawable.batman, getString(R.string.batman));
        Hero mHero1 = new Hero(R.drawable.spiderman, getString(R.string.spiderman));
        Hero mHero3 = new Hero(R.drawable.supperman, getString(R.string.superman));
        Hero mHero4 = new Hero(R.drawable.iceman, getString(R.string.iceman));
        Hero mHero5 = new Hero(R.drawable.ironman, getString(R.string.ironman));

        mListHero.add(mHero1);
        mListHero.add(mHero2);
        mListHero.add(mHero3);
        mListHero.add(mHero4);
        mListHero.add(mHero5);
    }
}
