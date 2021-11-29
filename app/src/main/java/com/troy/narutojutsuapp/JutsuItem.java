package com.troy.narutojutsuapp;

public class JutsuItem {

    private int imageResource;
    private String imageUrl;
    private String title;
    private String body;

    public JutsuItem( String imageUrl,int imageResource, String title,
                      String body) {
        this.imageUrl = imageUrl;
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
    }
    public String getImageUrl() {
        return imageUrl;
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
