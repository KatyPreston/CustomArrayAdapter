package com.example.user.myalbumlist;

import java.util.ArrayList;

public class TopAlbums {
    private ArrayList<Album> list;

    public TopAlbums(){
        list = new ArrayList<Album>();
        list.add(new Album(1, "Fantasies", "Metric"));
        list.add(new Album(2, "Execution of All Things", "Rilo Kiley"));
        list.add(new Album(3, "Once More With Feeling", "Buffy"));
        list.add(new Album(4, "After Laughter", "Paramore"));
        list.add(new Album(5, "Wicked Soundtrack", "Various"));
        list.add(new Album(6, "More Adventurous", "Rilo Kiley"));
        list.add(new Album(7, "Paramore", "Paramore"));
        list.add(new Album(8, "Take Offs and Landings", "Rilo Kiley"));
        list.add(new Album(9, "Synthetica", "Metric"));
        list.add(new Album(10, "The Very Best Of", "Fleetwood Mac"));
        list.add(new Album(11, "Super Extra Gravity", "The Cardigans"));
        list.add(new Album(12, "Gran Turismo", "The Cardigans"));
    }

    public ArrayList<Album> getList(){
        return new ArrayList<Album>(list);
    }
}
