package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import vn.edu.usth.weather.databinding.FragmentFirstBinding;

public class ForecastFragment extends Fragment {

private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        TextView day = new TextView(getContext());
        day.setText("Thursday");

        ImageView img = new ImageView(getContext());
        img.setImageResource(R.drawable.wi_cloud);

        View v = new View(getContext());
        v.setBackgroundColor(Color.parseColor("#20FF0000"));

        LinearLayout view = new LinearLayout(getContext());
        view.setOrientation(LinearLayout.VERTICAL);
        view.addView(day);
        view.addView(img);
        view.addView(v);
        return view;
    }

}