package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Log.i("info","Button Pressed");
        EditText myTextField = (EditText) findViewById(R.id.input);
        goToAct2(myTextField.getText().toString());
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }
    public void goToAct2(String s) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}
