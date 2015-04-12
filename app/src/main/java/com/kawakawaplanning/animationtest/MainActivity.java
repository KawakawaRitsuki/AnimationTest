/*
/
/参考サイト
/http://techbooster.jpn.org/andriod/application/1680/
/
 */

package com.kawakawaplanning.animationtest;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private AnimationDrawable anim;
    private ImageView image;
    private ImageView animImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView)findViewById(R.id.image_animation);
        image.setBackgroundResource(R.drawable.frame );
        anim = (AnimationDrawable)image.getBackground();

        animImage = (ImageView)findViewById(R.id.imageView);

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

    public void Alpha(View v) {
        AlphaAnimation alpha = new AlphaAnimation(1, 0.1f);//1から0.1に
        alpha.setDuration(1000);//アニメーション時間(ms単位)
        animImage.startAnimation(alpha);
    }

    public void Rotate(View v) {
        RotateAnimation rotate = new RotateAnimation(0, 360, animImage.getWidth()/2, animImage.getHeight()/2);//中心を軸xyで指定して、360度回転
        rotate.setDuration(1000);//アニメーション時間(ms単位)
        animImage.startAnimation(rotate);
    }

    public void ScaleUp(View v) {
        ScaleAnimation scale = new ScaleAnimation(1, 2, 1, 2);//２倍に拡大
        scale.setDuration(1000);//アニメーション時間(ms単位)
        animImage.startAnimation(scale);
    }

    public void ScaleDown(View v) {
        ScaleAnimation scale = new ScaleAnimation(1, 0.5f, 1, 0.5f);//半分に縮小
        scale.setDuration(1000);//アニメーション時間(ms単位)
        animImage.startAnimation(scale);
    }

    public void Translate(View v) {
        TranslateAnimation translate = new TranslateAnimation(0, 100, 0, 100);//0を起点として100先へ移動
        translate.setDuration(1000);//アニメーション時間(ms単位)
        animImage.startAnimation(translate);
    }
}
