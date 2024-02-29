package com.example.train;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button search;
    EditText destinationEditText, fromEditText, dateEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        destinationEditText = findViewById(R.id.destinationEditText);
        fromEditText = findViewById(R.id.departEditText);
        dateEditText = findViewById(R.id.dateEditText);

        search = (Button) findViewById(R.id.search_trains);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String destination = destinationEditText.getText().toString();
                String from = fromEditText.getText().toString();
                String date = dateEditText.getText().toString();

                // Créez l'intention
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                // Ajoutez les données supplémentaires
                intent.putExtra("DESTINATION", destination);
                intent.putExtra("FROM", from);
                intent.putExtra("DATE", date);
                startActivity(intent);
            }
        });
    }
}