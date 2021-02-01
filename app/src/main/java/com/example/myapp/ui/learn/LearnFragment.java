package com.example.myapp.ui.learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapp.LearnActivity;
import com.example.myapp.R;

public class LearnFragment extends Fragment {

    private LearnViewModel learnViewModel;
    private TextView tvA1, tvA2, tvB1, tvB2, tvC1, tvC2;
    private Intent i;
    private String englishLevel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learn, container, false);
        tvA1 = view.findViewById(R.id.tvA1);
        tvA1.setOnClickListener(listener);

        tvA2 = view.findViewById(R.id.tvA2);
        tvA2.setOnClickListener(listener);

        tvB1 = view.findViewById(R.id.tvB1);
        tvB1.setOnClickListener(listener);

        tvB2 = view.findViewById(R.id.tvB2);
        tvB2.setOnClickListener(listener);

        tvC1 = view.findViewById(R.id.tvC1);
        tvC1.setOnClickListener(listener);

        tvC2 = view.findViewById(R.id.tvC2);
        tvC2.setOnClickListener(listener);

        i = new Intent(LearnFragment.this.getActivity(), LearnActivity.class);

        return view;
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tvA1:
                    englishLevel = "A1";
                    break;
                case R.id.tvB1:
                    englishLevel = "A2";
                    break;
                case R.id.tvA2:
                    englishLevel = "B1";
                    break;
                case R.id.tvB2:
                    englishLevel = "B2";
                    break;
                case R.id.tvC1:
                    englishLevel = "C1";
                    break;
                case R.id.tvC2:
                    englishLevel = "C2";
                    break;
            }
            i.putExtra("level", englishLevel);
            startActivity(i);
        }
    };
}