package com.example.customadapterr;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TestList extends AppCompatActivity {

    ListView lv ;
    Button btn_add ;
    ArrayList<Post> posts = new ArrayList<>();
    PostAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_test_list);


        btn_add =findViewById(R.id.list_bttn_add);
        lv = findViewById(R.id.test_list);



        adapter = new PostAdapter(this, R.layout.custom_post_layout, posts);

        lv.setAdapter(adapter);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent  = new Intent(getBaseContext(), activity_add_post.class );

                    startActivityForResult(intent, 1 );


            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data != null) {
            Post post = (Post) data.getSerializableExtra("post");
            adapter.addItem(post);
            adapter.notifyDataSetChanged();


        } else {
            Toast.makeText(this, "No data returned", Toast.LENGTH_SHORT).show();
        }
    }}