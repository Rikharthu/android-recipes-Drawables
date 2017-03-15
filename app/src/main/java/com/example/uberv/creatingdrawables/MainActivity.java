package com.example.uberv.creatingdrawables;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundedCornerImageView imageView = (RoundedCornerImageView) findViewById(R.id.rounded_image_view);
        Bitmap source = BitmapFactory.decodeResource(getResources(),R.drawable.motor);
        imageView.setImage(source);
    }

    public void buttonClick(View view) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }
}
