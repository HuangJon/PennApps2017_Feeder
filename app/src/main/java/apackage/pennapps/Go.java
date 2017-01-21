package apackage.pennapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
    }

    public void toSwipe(View view) {
        Intent intent = new Intent(this, Swipe.class);
        startActivity(intent);
    }
}
