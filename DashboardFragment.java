package com.example.myapplication.fragments;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.myapplication.R;


public class DashboardFragment extends Fragment {

    public DashboardFragment() {
        super(R.layout.fragment_dashboard);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // Find the TextViews by their IDs
        TextView textViewDashboard = view.findViewById(R.id.textView2);

        // Set click listeners for each TextView
        textViewDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Dashboard Clicked!");
            }
        });

        return view;
    }

    // Method to show a long Toast message
    private void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }

}