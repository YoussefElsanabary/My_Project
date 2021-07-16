package com.example.first_training_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText FIRSTNUM;
        final EditText SECONDNUM;
        final TextView RESULT;
        final Button BTN;
        FIRSTNUM =(EditText) findViewById(R.id.FirstNum);
        SECONDNUM =(EditText) findViewById(R.id.SecondNum);
        RESULT =(TextView) findViewById(R.id.Result);
        BTN =(Button) findViewById(R.id.Add);
        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(FIRSTNUM.getText().toString());
                int n2 = Integer.parseInt(SECONDNUM.getText().toString());
                int S = n1+n2;
                RESULT.setText(String.valueOf(S));
            }
        });

    }



}