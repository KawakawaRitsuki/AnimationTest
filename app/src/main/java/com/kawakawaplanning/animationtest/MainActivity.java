package com.kawakawaplanning.animationtest;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private AnimationDrawable anim;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image_animation);
        image.setBackgroundResource( R.drawable.frame );
        anim = (AnimationDrawable)image.getBackground();
    }

    public void intent(View v){
        Uri uri = Uri.parse("https://github.com/KawakawaRitsuki/AnimationTest");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

    public void Start(View v){
        anim.start();
    }

    public void Stop(View v){
        anim.stop();
    }
}
