package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG,"onCreate");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,firstFragment).commit();
}

    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
