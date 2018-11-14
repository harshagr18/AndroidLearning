package com.firstjavaapp.harsh.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int nocoffee=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
    nocoffee=nocoffee+1;
    display(nocoffee);
    }

    public void submitOrder(View view) {
        displayPrice(nocoffee*5);
    }

    public void decrement(View view) {
        if(nocoffee!=0)
        {nocoffee=nocoffee-1;
        display(nocoffee);}
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_no);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_no);
        priceTextView.setText("TOTAL " + NumberFormat.getCurrencyInstance().format(number)+"\nThank You!");
    }
}