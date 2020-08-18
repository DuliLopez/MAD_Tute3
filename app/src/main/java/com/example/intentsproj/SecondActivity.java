package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    String s1;
    String s2;
    EditText txtMessage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.txtNum1);
        txt2 = findViewById(R.id.txtNum2);
        s1 = getIntent().getExtras().getString("MAIN_EXTRA1");
        s2 = getIntent().getExtras().getString("MAIN_EXTRA2");
        txt1.setText(s1);
        txt2.setText(s2);
    }

    public void  changeFragment(View view){
        txt1 = findViewById(R.id.txtNum1);
        txt2 = findViewById(R.id.txtNum2);
        Fragment fragment;
        if (view == findViewById(R.id.plus)){
            fragment = new AddFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2 = new Bundle();
            b2.putString("Num1",txt1.getText().toString());
            b2.putString("Num2",txt2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.sub)){
            fragment = new SubFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2 = new Bundle();
            b2.putString("Num1",txt1.getText().toString());
            b2.putString("Num2",txt2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.multiply)){
            fragment = new MultiplyFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2 = new Bundle();
            b2.putString("Num1",txt1.getText().toString());
            b2.putString("Num2",txt2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.division)){
            fragment = new DivisionFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2 = new Bundle();
            b2.putString("Num1",txt1.getText().toString());
            b2.putString("Num2",txt2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
    }
}