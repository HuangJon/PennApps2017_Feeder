package apackage.pennapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class Swipe extends AppCompatActivity  {

    private GestureDetectorCompat mDetector;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
    }

    public void yes(View view) {
        Intent intent = new Intent(this, Restaurant.class);
        String addr = "shake shack";
        String num = "(215) 423-1707";
        intent.putExtra("address", "shake shack");
        intent.putExtra("num", "(215) 423-1707");

        //TODO: something to store the preferences

        startActivity(intent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
