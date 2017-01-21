package apackage.pennapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class Resturant extends AppCompatActivity {

    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
//        View view = this.getWindow().getDecorView().getRootView();
//        LinearLayout swipeview = (LinearLayout) findViewById(R.id.activity_swipe);

        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
    }

    public void callNumber(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:(800)222-222"));
        startActivity(callIntent);
    }

    public void getDirections(View view) {
        //may want to pass in a geolocation for more accurate results?
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=shake+shake+2000+Sansom+St+Philadelphia");
        //Uri gmmIntentUri = Uri.parse("geo:0,0?q=Shake+Shack+Philadelphia+Pennsylvania");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
