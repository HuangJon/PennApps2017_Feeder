package apackage.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class Swipe extends AppCompatActivity  {

    private GestureDetectorCompat mDetector;

    public void yes(View view) {
        Intent intent = new Intent(this, Resturant.class);
        //TODO: something to store the preferences
        //TODO: store the address of the resturant to be passed to maps
        //TODO: store phone number of resturant to call
        startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
