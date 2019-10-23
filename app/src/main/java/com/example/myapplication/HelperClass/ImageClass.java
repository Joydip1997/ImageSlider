package com.example.myapplication.HelperClass;

public class ImageClass {
    private String text,url,link;


    public ImageClass()
    {

    }


    public ImageClass(String text, String url, String link) {
        this.text = text;
        this.url = url;
        this.link = link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
