package com.firstjavaapp.harsh.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
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
    int price=5;
    boolean hasCream;
    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
    nocoffee=nocoffee+1;
    display(nocoffee,price);
    }

    public void submitOrder(View view) {
        CheckBox creamcheck = (CheckBox) findViewById(R.id.creamcheck);
        hasCream= creamcheck.isChecked();
        displayPrice(nocoffee,price);
    }

    public void decrement(View view) {
        if(nocoffee!=0)
        {nocoffee=nocoffee-1;
        display(nocoffee,price);}
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number,int price) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_no);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int nos,int price) {
        int number=nos*price;
        TextView priceTextView = (TextView) findViewById(R.id.price_no);
        priceTextView.setText("Name:Harsh Agrawal\nHas whipped cream?" + hasCream + "\nQuantity: " + nos + "\nTotal = $" + number+ "\nThank You!" );
    }
}