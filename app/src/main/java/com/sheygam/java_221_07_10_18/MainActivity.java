package com.sheygam.java_221_07_10_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button myButton, mySecondButton;
    private EditText myInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.my_btn);
        mySecondButton = findViewById(R.id.my_second_button);
        mySecondButton.setOnClickListener(this);
        myButton.setOnClickListener(this);
        myInput = findViewById(R.id.my_input);

        Button mySuperButton = findViewById(R.id.my_super_btn);
        mySuperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
            }
        });

        TextView myTxt = findViewById(R.id.my_txt);
        String str = (String) myTxt.getText();
        myTxt.setText("My super text");

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.my_btn){
            String input = String.valueOf(myInput.getText());
            myInput.setText("");
            Log.d("MY_TAG",input);
        }else if(v.getId() == R.id.my_second_button){
//            Toast.makeText(this,"Was clicked second btn",Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Was clicked btn", Toast.LENGTH_SHORT).show();
        }
    }
}
