package com.example.train;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView; // Ajout de cette ligne

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Main2Activity extends AppCompatActivity {

    TextView destinationTextView;
    TextView fromTextView;
    TextView dateTextView;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        destinationTextView = findViewById(R.id.destinationTextView);
        fromTextView = findViewById(R.id.departEditText);
        dateTextView = findViewById(R.id.dateTextView);

        // Récupérez les données transmises par l'intent
        Intent intent = getIntent();
        if (intent != null) {
            String destination = intent.getStringExtra("DESTINATION");
            String from = intent.getStringExtra("FROM");
            String date = intent.getStringExtra("DATE");

            // Affichez les données dans les TextViews
            destinationTextView.setText("Destination: " + destination);
            fromTextView.setText("From: " + from);
            dateTextView.setText("Date: " + date);
        }
    }
}
