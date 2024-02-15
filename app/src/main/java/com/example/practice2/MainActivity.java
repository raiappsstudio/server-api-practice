package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText ednumber;
    TextView tvDisplay;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ednumber = findViewById(R.id.ednumber);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplay.setText("");

                String snumber = ednumber.getText().toString();
                int number= Integer.parseInt(snumber);

                int mul = 0;

                for (int x=2; x<=number; x+=2){

                  mul = x+x;

                    tvDisplay.append(x+", ");
                }

                tvDisplay.append("\nsum is :"+mul);

            }
        });




    }
}