package apackage.pennapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void callNumber(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:(215) 423-1707"));
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
}
