package com.example.keng.threeking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int number = 0;
    private int[] Image_Ids = new int[]{
      R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4
    };
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number<Image_Ids.length-1){
                    number++;
                    imageView.setBackgroundResource(Image_Ids[number]);
                }
                else {
                    Toast.makeText(MainActivity.this,"It is the last picture!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
