package com.example.customadapterr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {

    Context c ;
    int resource ;
    ArrayList<Post> posts ;


    public PostAdapter(Context c, int resource , ArrayList<Post> posts ) {

        this.posts = posts;
        this.c = c;
        this.resource= resource;


    }

    public void addItem(Post post ){

        this.posts.add(post);


    }


    @Override
    public int getCount() {
        return posts.size() ;
    }

    @Override
    public Post getItem(int i) {

        return posts.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view , ViewGroup parent) {

        View v = view ;

        if (v == null){


            v = LayoutInflater.from(c).inflate(resource ,null , false)  ;


        }

        TextView tv_date      =  v.findViewById(R.id.tx_date)        ;
        TextView tv_name      =  v.findViewById(R.id.custom_tv_name) ;
        TextView tv_following =  v.findViewById(R.id.following_data) ;
        TextView tv_followers =  v.findViewById(R.id.followors_data) ;
        TextView tv_body      =  v.findViewById(R.id.custom_tv_body) ;
        TextView tv_posts     =  v.findViewById(R.id.posts_data)     ;


        Post p = getItem(i);



        tv_date.setText(p.getDate()) ;
        tv_name.setText(p.getName()) ;
        tv_body.setText(p.getBody()) ;
        tv_followers.setText(p.getFollowers()+ "") ;
        tv_following.setText(p.getFollowing()+"")  ;
        tv_posts.setText(p.getPosts()+"") ;

        return v ;


    }
}
