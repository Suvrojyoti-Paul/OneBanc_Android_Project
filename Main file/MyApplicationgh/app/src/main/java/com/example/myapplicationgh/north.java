package com.example.myapplicationgh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class north extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        bt1 = (Button) findViewById(R.id.but);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCart();
            }
        });

        bt5 =(Button) findViewById(R.id.button6);
        bt5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityCart();
            }
        });


        bt4 =(Button) findViewById(R.id.button5);
        bt4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityCart();
            }
        });


        bt3 =(Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityCart();
            }
        });


        bt2 =(Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityCart();
            }
        });

    }
    public void openActivityCart(){
        Intent intent =new Intent(this, cart.class);
        startActivity(intent);
    }
}

