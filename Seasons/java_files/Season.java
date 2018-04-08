package pl.edu.zslp.seasons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Season extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    public static final Random RANDOM=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);

        



        if (getIntent().hasExtra("key")) {

            /*  we assign sended season name from MainActivity to String variable text*/
            String text = getIntent().getExtras().getString("key");
             /* get TextView object from season.xml */
            textView = (TextView) findViewById(R.id.textView);
            /* display text variable in textView object*/
            textView.setText(text);
        }

        if (getIntent().hasExtra("key1")) {

            int image=getIntent().getExtras().getInt("key1");
            imageView=(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(image);

            final Animation anim1= AnimationUtils.loadAnimation(this,R.anim.my_animation);
            final Animation.AnimationListener animationListener = new Animation.AnimationListener() {


                @Override
                public void onAnimationStart(Animation animation) {
                    
                }

                @Override
                public void onAnimationEnd(Animation animation) {

                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            };

            anim1.setAnimationListener(animationListener);


            imageView.startAnimation(anim1);

        }


        }



    }
