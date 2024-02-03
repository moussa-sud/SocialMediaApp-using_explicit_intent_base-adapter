package com.example.customadapterr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class activity_add_post extends AppCompatActivity {
     EditText et_name , et_body , et_following , et_followers , et_posts , et_date;

     final int  RESULT_OK = 1;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        et_name = findViewById(R.id.add_post_name);
        et_body = findViewById(R.id.add_post_body);
        et_date = findViewById(R.id.add_post_date);
        et_followers = findViewById(R.id.add_post_followers);
        et_following= findViewById(R.id.add_post_following);
        et_posts = findViewById(R.id.add_post_posts);
        button = findViewById(R.id.add_bt_save);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = et_name.getText().toString();
                String body = et_body.getText().toString();
                String date = et_date.getText().toString();
                int followers = Integer.parseInt(et_followers.getText().toString());
                int following = Integer.parseInt(et_following.getText().toString());
                int posts = Integer.parseInt(et_posts.getText().toString());

                Post post = new Post( date,  name,  body,  followers,  following,  posts );
                Intent i = new Intent();

                i.putExtra("post" , post);
                setResult(1 ,i);
                finish();




            }
        });

    }
}