package com.example.user.myalbumlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlbumTest {
    Album album;

    @Before
    public void before(){
        album = new Album(1, "Soundtrack", "Various");
    }

    @Test
    public void canGetRanking(){
        assertEquals(1, album.getRanking());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Soundtrack", album.getTitle());
    }

    @Test
    public void canGetArtist(){
        assertEquals("Various", album.getArtist());
    }

}
