package com.example.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    private EditText edtpunch;
    private Button btnsavetosever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtpunch = findViewById(R.id.edtpunchtext);
        btnsavetosever= findViewById(R.id.btnsavesever);
        btnsavetosever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject Boxer = new  ParseObject("Boxer");
                Boxer.put("punch_speed", Integer.parseInt(edtpunch.getText().toString()) );
                Boxer.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if(e==null){
                            Toast.makeText(MainActivity.this, "Boxer object is saved successfully", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

}