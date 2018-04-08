package pl.edu.zslp.rolldicesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

import pl.edu.zslp.rolldicesgame.R;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);  }
    /* returns random number from1 to 6*/
    public static int rand() {
        return RANDOM.nextInt(6) + 1;
    }
    /* returns picture of dice named dice_random number */
    public int res() {
        return getResources().getIdentifier("dice_" + rand(), "drawable",
                "pl.edu.zslp.rolldicesgame");
    }
    public void MClick(View view) {
        final Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake);
        final Animation anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake);
        final Animation.AnimationListener animationListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                imageView1.setImageResource(res());
                imageView2.setImageResource(res());
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }};
        anim1.setAnimationListener(animationListener);
        anim2.setAnimationListener(animationListener);
        imageView1.startAnimation(anim1);
        imageView2.startAnimation(anim2);
    }
}
