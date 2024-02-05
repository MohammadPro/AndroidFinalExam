package com.example.myapplication.fragments;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.myapplication.R;

import org.w3c.dom.Text;

public class SearchFragment extends Fragment {


        public SearchFragment() {
            super(R.layout.search_fragment);
        }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment, container, false);

        // Find the TextViews by their IDs
        TextView textViewSearch = view.findViewById(R.id.textView3);

        // Set click listeners for each TextView
        textViewSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Search clicked!");
            }
        });

        return view;
    }

    // Method to show a long Toast message
    private void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
    }


