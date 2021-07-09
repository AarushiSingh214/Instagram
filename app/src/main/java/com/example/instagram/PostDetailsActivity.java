package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.instagram.databinding.ActivityPostDetailsBinding;
import org.parceler.Parcels;

import java.util.Date;


public class PostDetailsActivity extends AppCompatActivity {

 //   ImageView ivPic;
//    TextView tvCaption;
    ActivityPostDetailsBinding binding;
    Date createdAt;
    String timeAgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPostDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //setContentView(R.layout.activity_post_details);

//        ivPic = findViewById(R.id.ivPic);
//        tvCaption = findViewById(R.id.tvCaption);

        Post post = (Post) Parcels.unwrap(getIntent().getParcelableExtra("post"));
        Log.i("postdetailsactivity", "parceable");
        String variable = post.getDescription();
        binding.tvCaption.setText(post.getDescription());
//        createdAt = post.getCreatedAt();
        timeAgo = Post.calculateTimeAgo(post.getCreatedAt());
        binding.tvCreatedAt.setText(timeAgo);
        Glide.with(this)
                .load(post.getImage().getUrl())
                .into(binding.ivPic);

    }
}