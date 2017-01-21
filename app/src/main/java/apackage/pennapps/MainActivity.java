package apackage.pennapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toGo(View view) {
        Intent intent = new Intent(this, Go.class);
        //TODO: something to store the preferences
        startActivity(intent);
    }


}
