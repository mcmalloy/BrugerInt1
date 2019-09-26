package com.example.brugerint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button IndstillingButton;
    Button WebButton;
    TextView Introtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Introtext = findViewById(R.id.textView1);

        WebButton = findViewById(R.id.button);
        IndstillingButton = findViewById(R.id.button2);

        WebButton.setOnClickListener(this);
        IndstillingButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        System.out.println("Button has been pressed");
        if(v == IndstillingButton){
            Introtext.setText("You pressed Indstilling");
            if(IndstillingButton.getText().equals("Indstilling")){ // Changing text of button for fun
                IndstillingButton.setText("Ipsum");
            }
            else{
                IndstillingButton.setText("Indstilling");
            }
        }
        else if(v == WebButton){
            Introtext.setText("You pressed WebButton");
            Intent i = new Intent(this,WebviewActivity.class);
            startActivity(i);
        }
    }
}
