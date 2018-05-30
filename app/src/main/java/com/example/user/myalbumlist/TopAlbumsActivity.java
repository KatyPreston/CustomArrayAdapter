package com.example.user.myalbumlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_albums);

        TopAlbums topAlbums = new TopAlbums();
        ArrayList<Album> list = topAlbums.getList();

        TopAlbumsAdapter albumAdapter = new TopAlbumsAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}
