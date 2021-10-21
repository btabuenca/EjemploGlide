package es.upm.miw.ejemploglide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsa (View v) {

        String imgUrl = "https://i.pinimg.com/474x/e3/94/47/e39447de921955826b1e498ccf9a39af--chuck-norris-paradis.jpg";

        ImageView imageView = findViewById(R.id.thumbnail);

        Glide.with(this)
                .load(imgUrl)
                .thumbnail(0.5f)
                .crossFade(5000)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
