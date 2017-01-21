package apackage.pennapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Resturant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void callNumber(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(860) 941-2482"));
        startActivity(callIntent);
    }

    public void getDirections(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Shake+Shack+Philadelphia+Pennsylvania");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
