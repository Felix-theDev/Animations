package com.company.animations;
/** A simple animation app
 * @author Felix Ogbonnaya
 * @since 2020-02-08
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    boolean bartIsShowing = true;

    public void fade(View view) {
        ImageView bartImage = findViewById(R.id.bartImage);
        bartImage.animate().translationXBy(1000).rotationX(3600).setDuration(3000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bartImage = findViewById(R.id.bartImage);
        bartImage.setX(-1000);
    }

}






//    public void fade(View view){
//        ImageView bartImage = findViewById(R.id.bartImage);
//        ImageView homerImage = findViewById(R.id.homerImage);
//
//        if(bartIsShowing){
//            bartImage.animate().alpha(0).setDuration(1000);
//            homerImage.animate().alpha(1).setDuration(1000);
//
//            bartIsShowing = false;
//        }
//        else {
//            homerImage.animate().alpha(0).setDuration(1000);
//            bartImage.animate().alpha(1).setDuration(1000);
//
//            bartIsShowing = true;
//        }
//    }
