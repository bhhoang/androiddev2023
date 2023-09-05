package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.weather.databinding.ActivityWeatherBinding;

public class WeatherActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityWeatherBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("WeatherActivity", "onCreate called");
        setContentView(R.layout.activity_weather);

}

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy called");
    }
}