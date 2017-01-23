package com.tech42.mari.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    int images[] = {R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher};
    String texts[] = { "First Text" , "Second Text" , "Third Text" , "Fourth Text" , "First Text" , "Second Text" , "Third Text" , "Fourth Text" , "First Text" , "Second Text" , "Third Text" , "Fourth Text" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        MyAdapter adapter = new MyAdapter(images , texts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public static List<Information> getData()
    {
        List<Information> data=new ArrayList<>();
        int images[] = {R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher , R.mipmap.ic_launcher};
        String texts[] = { "First Text" , "Second Text" , "Third Text" , "Fourth Text" };

        for (int i=0;i<texts.length;i++)
        {
            Information current = new Information();
            current.imageid=images[i];
            current.text=texts[i];
            data.add(current);
        }
        return data;
    }
}
