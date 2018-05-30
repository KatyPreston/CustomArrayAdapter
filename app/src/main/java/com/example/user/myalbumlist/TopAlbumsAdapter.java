package com.example.user.myalbumlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopAlbumsAdapter extends ArrayAdapter<Album> {
    public TopAlbumsAdapter(Context context, ArrayList<Album> albums){
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.albums_item, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle().toString());

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist().toString());

        listItemView.setTag(currentAlbum);

        return listItemView;
    }
}
