package com.example.quoteapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button refreshButton;

    private String[] quotes = {
            "The best way to predict the future is to create it.",
            "You miss 100% of the shots you don’t take.",
            "Success is not the key to happiness. Happiness is the key to success.",
            "Hardships often prepare ordinary people for an extraordinary destiny.",
            "Do not wait to strike till the iron is hot; but make it hot by striking.",
            "Whether you think you can, or you think you can’t, you’re right."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        refreshButton = findViewById(R.id.refreshButton);

        showRandomQuote();

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomQuote();
            }
        });
    }

    private void showRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        String randomQuote = quotes[index];
        quoteTextView.setText(randomQuote);
    }
}
