package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    String editTextVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getBaseContext(),MainActivity2.class);
                editTextVal=editText.getText().toString();
                i.putExtra("Value",editTextVal);
                startActivity(i);
                finish();
            }
        });
    }
}



