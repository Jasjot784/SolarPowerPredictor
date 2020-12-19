package com.jasjotsingh.solarpowerpredictor.data;

public class About {
    public final int imageResource;
    public String title;
    public String email;
    public String info;

    public About( String title,String info, String email,int imageResource) {
        this.imageResource = imageResource;
        this.title = title;
        this.email = email;
        this.info = info;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return info;
    }
}
