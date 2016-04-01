package com.example.evgeniy.beeradvaiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){

        TextView brands = (TextView)findViewById(R.id.brands);
        Spinner color = (Spinner)findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        List<String> beers = BeerExpert.getBrands(beerType);

        StringBuilder advice = new StringBuilder();
        for(String n: beers){
            advice.append(n).append('\n');
        }

        brands.setText(advice);

    }
}
