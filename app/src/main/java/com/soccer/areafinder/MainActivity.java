package com.soccer.areafinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int n,n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText squreside=findViewById(R.id.editTextNumber);


          Button button2=  findViewById(R.id.button);
                  button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String number=squreside.getText().toString();
                    n=Integer.parseInt(number);
                    int ans=n*n;

                    TextView textView = findViewById(R.id.textView4);
                    textView.setText(String.valueOf(ans));
                }
            });

       Button button= findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               n=0;
               squreside.setText("");
            }
        });

        EditText length=findViewById(R.id.editTextNumber3);
        EditText width=findViewById(R.id.editTextNumber2);


      Button button3 =findViewById(R.id.button2);
              button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(length.getText().toString());
                n2=Integer.parseInt(width.getText().toString());
                int ans2=n1*n2;

                TextView textView = findViewById(R.id.textView5);
                textView.setText(String.valueOf(ans2));
            }
        });
      Button button4=  findViewById(R.id.button4);
      button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              length.setText("");
              width.setText("");
              n1=0;n2=0;
            }
        });
    }
}