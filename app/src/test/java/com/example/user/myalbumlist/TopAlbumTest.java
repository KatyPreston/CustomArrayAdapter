package com.example.user.myalbumlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopAlbumTest {

    @Test
    public void getListTest() {
        TopAlbums topAlbums = new TopAlbums();
        assertEquals(12, topAlbums.getList().size());
    }
}
