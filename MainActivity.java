package com.example.login_n;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign(View view) {
        e1.findViewById(R.id.et1);
        e2.findViewById(R.id.et2);
        e3.findViewById(R.id.et3);
        e4.findViewById(R.id.et4);
        e5.findViewById(R.id.et5);
        s1=e1.getText().toString();

        if (!s1.contains("@")){
            Toast.makeText(this, "Invalid email id", Toast.LENGTH_SHORT).show();
        }
        else if (e2.length()<8){
            Toast.makeText(this, "must have 8 character", Toast.LENGTH_SHORT).show();
        }
        else if (e3.length()==0){
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        }
        else if (e4.length()==0){
            Toast.makeText(this, "enter the DOB", Toast.LENGTH_SHORT).show();
        }
        else if (e5.length()==0){
            Toast.makeText(this, "enter the gender", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
        }

    }
}