package com.example.hackerinside.diceee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftdice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);
        final int[] diceArray = {
                R.drawable.dice01,
                R.drawable.dice02,
                R.drawable.dice03,
                R.drawable.dice04,
                R.drawable.dice05,
                R.drawable.dice06
        };

        rollButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Log.d("Dicee", "Ze Button Clicked");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                leftdice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }



        });
    }
}
