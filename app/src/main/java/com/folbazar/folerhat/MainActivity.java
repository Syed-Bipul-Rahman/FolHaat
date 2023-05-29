package com.folbazar.folerhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//all global variables

    //linearlayout variable
    LinearLayout linearLayout;


    //auto image slider variable
    ImageSlider imageSlider;
    ArrayList<SlideModel> imageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //full screen mode hide status bar
        getWindow().setFlags(1024, 1024);


        //call initialization method
        initializations();
        //call image slider method
        imagesliderm();
    }
    private void imagesliderm() {
        imageList.add(new SlideModel(R.drawable.banner1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.banner2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.banner3, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.banner2, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);

    }
    private void initializations() {

        //image slider for first page
        imageSlider = findViewById(R.id.img_slid);
    }
}