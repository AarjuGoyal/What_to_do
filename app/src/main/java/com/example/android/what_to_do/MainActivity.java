package com.example.android.what_to_do;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void FlipACoin(View View){
        Random rand = new Random();
        int n = rand.nextInt(2)+ 1;
        //int n=1;
        if(n==1)
            displayValue("H");
        else
            displayValue("T");
    }

    public void ThrowADie(View View){
        Random rand = new Random();
        int n = rand.nextInt(6)+ 1;
        switch(n){
            case 1: displayValue("One");
                    break;
            case 2: displayValue("Two");
                    break;
            case 3: displayValue("Three");
                    break;
            case 4: displayValue("Four");
                    break;
            case 5: displayValue("Five");
                    break;
            case 6: displayValue("Six");
                    break;

        }
    }

    public void SpinWheel(View View){
        Random rand = new Random();
        int n = rand.nextInt(10)+ 1;
        String NumberString = String.valueOf(n);
        displayValue(NumberString);
    }

    private void displayValue(String n){
        TextView number = (TextView) findViewById(R.id.Value_Of_Throw);
        number.setText(n);
    }
}
