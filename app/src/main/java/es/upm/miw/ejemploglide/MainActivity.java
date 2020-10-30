package es.upm.miw.ejemploglide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

// https://www.androidhive.info/2016/04/android-glide-image-library-building-image-gallery-app/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsa (View v) {
        String imgUrl = "https://api.androidhive.info/images/glide/medium/deadpool.jpg";

        ImageView imageView = findViewById(R.id.thumbnail);

        Glide.with(this)
                .load(imgUrl)
                .thumbnail(0.5f)
                .crossFade(5000)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
