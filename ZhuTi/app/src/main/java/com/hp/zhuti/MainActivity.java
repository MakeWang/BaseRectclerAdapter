package com.hp.zhuti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRectclerView;
    private MyRecyclerViewAdapter3 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.remoceAll();
            }
        });

        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.updateItem(1,"ddd");
            }
        });

        List<String> array = new ArrayList<String>();
        for (int i = 0; i < 30;i++){
            array.add("item"+i);
        }

        mRectclerView = (RecyclerView)findViewById(R.id.rectclerView);
        adapter = new MyRecyclerViewAdapter3(this,array);
        mRectclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRectclerView.setAdapter(adapter);

        mRectclerView.setItemAnimator(new DefaultItemAnimator());
        adapter.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemOnClickListener<String>() {
            @Override
            public void onItemClick(View view, int postion, String data) {
                Toast.makeText(MainActivity.this,"点击："+postion,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongItemClick(View view, int postion, String data) {
                Toast.makeText(MainActivity.this,"长按："+postion,Toast.LENGTH_LONG).show();
            }
        });


    }
}
