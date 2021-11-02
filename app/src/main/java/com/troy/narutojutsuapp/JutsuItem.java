package com.troy.narutojutsuapp;

public class JutsuItem {

    private int imageResource;
    private int gifResource;
    private String title;
    private String body;

    public JutsuItem( int gifResource,int imageResource, String title,
                      String body) {
        this.gifResource = gifResource;
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
    }
    public int getGifResource() {
        return gifResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
