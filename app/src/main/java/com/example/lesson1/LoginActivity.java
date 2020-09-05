package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = (TextView) findViewById(R.id.textView_1);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View v){
                Intent intent = new Intent(this, Registration.class);
                startActivity(intent);

            }
        });


    }
}
