package com.example.user.myalbumlist;

public class Album {
    private Integer ranking;
    private String title;
    private String artist;


    public Album(int ranking, String title, String artist){
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
    }

    public Integer getRanking(){
        return this.ranking;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }
}
