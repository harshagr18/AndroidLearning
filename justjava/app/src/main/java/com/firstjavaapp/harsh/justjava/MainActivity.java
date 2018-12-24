package com.firstjavaapp.harsh.justjava;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
    boolean hasChoco;
    String hisname;
    String ordermail;
    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        if(nocoffee<=100)
        {nocoffee=nocoffee+1;
    display(nocoffee,price);}
    }

    public void submitOrder(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        hisname= name.getText().toString();
        CheckBox creamcheck = (CheckBox) findViewById(R.id.creamcheck);
        hasCream= creamcheck.isChecked();
        CheckBox chocochek = (CheckBox) findViewById(R.id.chococheck);
        hasChoco= chocochek.isChecked();
        displayPrice(nocoffee,price);
        }

    public void decrement(View view) {
        if(nocoffee>1)
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
    public void displayPrice(int nos,int price) {
        if(hasCream==true)
        {
            price=price+1;
        }
        if(hasChoco==true)
        {
            price=price+2;
        }
        int number=nos*price;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "agrawalco.9@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Trying to order");
        ordermail = ("Name: "+hisname+"\nHas whipped cream?" + hasCream +"\nHas chocolate Toppings? " + hasChoco + "\nQuantity: " + nos + "\nTotal = $" + number+ "\nThank You!" );
        intent.putExtra(Intent.EXTRA_TEXT, ordermail);
        startActivity(Intent.createChooser(intent, "Send Email"));

    }
}