package com.nikhil.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<10;i++) {
            Log.d("nikhil","i is "+i);
        }
        
        for(int i=0;i<10;i++) {
            Log.d("nikhil","i is "+i);
        }

        for(int i=0;i<10;i++) {
            Log.d("nikhil","i is "+i);
        }

        masterMethod();
        sampleMethod();
        branchMethod();
    }

    public void masterMethod() {
        Log.d("nikhil","master branch method");
    }
    public void sampleMethod() {
        Log.d("nikhil","there is nothing in this method");
    }

    public void branchMethod() {
        Log.d("nikhil","this is branch method");
    }
    
    public void masterMethod2() {
        Log.d("nikhil","master method 2");
    
    }
}
