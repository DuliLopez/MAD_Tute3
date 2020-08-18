package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText txtMessage1;
    EditText txtMessage2;
    String s1;
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage1 = findViewById(R.id.txtNum1);
        txtMessage2 = findViewById(R.id.txtNum2);
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        s1 = txtMessage1.getText().toString();
        s2 = txtMessage2.getText().toString();
        intent.putExtra("MAIN_EXTRA1",s1);
        intent.putExtra("MAIN_EXTRA2",s2);
        startActivity(intent);
    }
}