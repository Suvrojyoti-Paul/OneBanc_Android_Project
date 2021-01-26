package com.example.myapplicationgh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondpage extends AppCompatActivity {
 private Button button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        button2 =(Button) findViewById(R.id.but);
        button3 = (Button) findViewById(R.id.button4);
        button4 = (Button) findViewById((R.id.button5));
        button5 = (Button) findViewById(R.id.button3);
        button6 = (Button) findViewById(R.id.button2);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMed();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityItalian();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySouth();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityChinese();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivityNorth();
            }
        });
    }
    public void openActivityMed(){
        Intent intent5 =new Intent(this, med.class);
        startActivity(intent5);
    }
    public void openActivityItalian(){
        Intent intent4 =new Intent(this, italian.class);
        startActivity(intent4);
    }
    public void openActivitySouth(){
        Intent intent3 =new Intent(this, south.class);
        startActivity(intent3);
    }
    public void openActivityChinese(){
        Intent intent2 =new Intent(this, chinese.class);
        startActivity(intent2);
    }
    public void openActivityNorth(){
        Intent intent1 =new Intent(this, north.class);
        startActivity(intent1);
    }
}