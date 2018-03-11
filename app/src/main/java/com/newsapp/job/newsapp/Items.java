package com.newsapp.job.newsapp;

/**
 * Created by shady on 3/10/2018.
 */

public class Items {
    int photo ;
    String title;
    String desc ;

    public Items() {

    }

    public Items( String title, String desc , int photo) {
        this.photo = photo;
        this.title = title;
        this.desc = desc;
    }

    //////

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ///////////////////

    public int getPhoto() {

        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
