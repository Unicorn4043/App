package com.example.myapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openMainActivity1Button = findViewById(R.id.button2);

        openMainActivity1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Button searchButton = findViewById(R.id.button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText searchEditText = findViewById(R.id.editTextText2);
                String searchText = searchEditText.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                intent.putExtra("searchText", searchText);
                startActivity(intent);
            }
        });
    }
}