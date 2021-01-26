package com.example.myapplicationgh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button) findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivitysecondpage();
            }
        });
    }
    public void openActivitysecondpage(){
        Intent intent =new Intent(this, secondpage.class);
        startActivity(intent);
    }
}