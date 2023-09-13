package vn.edu.usth.weather;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        TextView tv = new TextView(getContext());
        tv.setId(View.generateViewId());
        LinearLayout forecastArea = new LinearLayout(getContext());
        forecastArea.setOrientation(LinearLayout.VERTICAL);
        forecastArea.setBackgroundColor(Color.parseColor("#1A3551"));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        forecastArea.layout(0, 0, 0, 0);
        params.gravity = 1;
        params.weight = 1;
        params.setMargins(50, 100, 50, 100);
        forecastArea.setLayoutParams(params);
        forecastArea.setPadding(50, 100, 50, 100);
        for (String s : days) {
            // Linear Layout for each day containing day, image
            LinearLayout.LayoutParams dayLayoutParam = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            LinearLayout.LayoutParams componentLayoutParam = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            componentLayoutParam.weight = 1;
            componentLayoutParam.width = 0;
            componentLayoutParam.height = 215;
            componentLayoutParam.gravity = 1;
            LinearLayout dayLayout = new LinearLayout(this.getContext());
            dayLayout.setOrientation(LinearLayout.HORIZONTAL);

            TextView day = new TextView(getContext());
            day.setText(s);
            day.setTextSize(25);
            day.setGravity(Gravity.CENTER);
            day.setTextColor(Color.parseColor("#E8E8E8"));
            day.setLayoutParams(componentLayoutParam);

            ImageView image = new ImageView(getContext());
            image.setImageResource(R.drawable.ic_rainy_weather);
            image.setLayoutParams(componentLayoutParam);
            dayLayout.addView(day);
            image.setForegroundGravity(1);
            dayLayout.addView(image);

            TextView temperature = new TextView(getContext());
            temperature.setText("30°C");
            temperature.setTextSize(25);
            temperature.setGravity(17);
            temperature.setTextColor(Color.parseColor("#E8E8E8"));
            temperature.setLayoutParams(componentLayoutParam);
            dayLayout.addView(temperature);
            dayLayout.setLayoutParams(dayLayoutParam);
            forecastArea.addView(dayLayout);
        }

        LinearLayout view = new LinearLayout(getContext());
        view.setBackgroundColor(Color.parseColor("#E6E6E6"));
        view.setOrientation(LinearLayout.VERTICAL);
        view.addView(forecastArea);
        return view;
    }

}

/*

        ListView lv = new ListView(getContext());
        lv.setBackgroundColor(Color.parseColor("#20FF0000"));
        lv.setPadding(50, 100, 50, 100);
        lv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                days
        ) {
            @NonNull
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(android.R.id.text1);
                text.setTextColor(Color.BLACK);
                return view;
            }
        };
        lv.setAdapter(adapter);
        lv.setBackgroundColor(Color.parseColor("#dfdfff"));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
            // Linear Layout for each day containing day, temperature, and image
            public LinearLayout getLayout() {
                LinearLayout layout = new LinearLayout(getContext());
                layout.setOrientation(LinearLayout.HORIZONTAL);
                layout.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                ));
                layout.setPadding(50, 100, 50, 100);
                layout.setBackgroundColor(Color.parseColor("#dfdfff"));
                // Day
                TextView day = new TextView(getContext());
                day.setId(View.generateViewId());
                day.setText(this.Day);
                day.setTextSize(20);
                day.setPadding(50, 100, 50, 100);
                day.setTextColor(Color.parseColor("#000000"));
                day.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                ));
                layout.addView(day);
                // Temperature
                TextView temperature = new TextView(getContext());
                temperature.setId(View.generateViewId());
                temperature.setText(this.Temperature);
                temperature.setTextSize(20);
                temperature.setPadding(50, 100, 50, 100);
                temperature.setTextColor(Color.parseColor("#000000"));
                temperature.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                ));
                layout.addView(temperature);
                // Image
                ImageView image = new ImageView(getContext());
                image.setId(View.generateViewId());
                image.setImageResource(R.drawable.wi_cloud);
                image.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                ));
                layout.addView(image);
                return layout;
            }
* */