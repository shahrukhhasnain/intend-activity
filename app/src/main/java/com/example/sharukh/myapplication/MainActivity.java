package com.example.sharukh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;


import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button goforcalculatorbutton = (Button) findViewById(R.id.goforcalculatorbutton);

        goforcalculatorbutton.setOnClickListener (
            new Button.OnClickListener()
            {
                @Override
                public void onClick (View v)
                {
                    Intent myintent = new Intent(v.getContext(), calculatorActivity.class);
                    startActivity(myintent);
                }
            }
            );
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
