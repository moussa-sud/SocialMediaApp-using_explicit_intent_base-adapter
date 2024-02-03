package com.example.customadapterr;

import java.io.Serializable;

public class Post implements Serializable {

    private String date;
    private String name;
    private String body;
    private int followers;
    private int following;
    private int posts;

    public Post(String date, String name, String body, int followers, int following, int posts) {

        this.date = date;
        this.name = name;
        this.body = body;
        this.followers = followers;
        this.following = following;
        this.posts = posts;

    }

    // Getters
    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public int getPosts() {
        return posts;
    }

    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }


}
