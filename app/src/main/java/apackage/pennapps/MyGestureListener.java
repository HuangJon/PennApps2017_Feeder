package apackage.pennapps;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
    private static final String DEBUG_TAG = "Gestures";

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d(DEBUG_TAG,"onDown: " + event.toString());
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + event1.toString()+event2.toString());
        if(event1.getX() - event2.getX() > 120 && Math.abs(velocityX) > 200) {

            //if (view.equals(R.id.toGo)) {
               // view.performClick();
            //}

            return true; // Right to left
        }  else if (event2.getX() - event1.getX() > 120 && Math.abs(velocityX) > 200) {
            return false; // Left to right
        }   else{return false;}

    }
}
