package com.example.lifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG="my activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Activity1 on create is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Activity1 on start is called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Activity1 on restart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Activity1 on resume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Activity1 on pause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Activity1 on stop is called");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"Activity1 on destroy is called");
        super.onDestroy();
        Log.i(TAG,"Activity1 on destroy is called");

    }


    public void next(View view) {

       // Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,Main2Activity.class);
        startActivity(intent);


    }


    public void nextwithexit(View view) {

        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
      finish();

    }
}
