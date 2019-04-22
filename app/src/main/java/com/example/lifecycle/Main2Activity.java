package com.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    String TAG="my activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG,"Activity2 on create is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Activity2 on start is called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Activity2 on start is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Activity2 on resume is called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Activity2 on pause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Activity2 on stop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Activity2 on destroy is called");
    }


    public void prev(View view) {

        Intent intent=new Intent(this,MainActivity.class);
       startActivity(intent);
       finish();

    }
}
