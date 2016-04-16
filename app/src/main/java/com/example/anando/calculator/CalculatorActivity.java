package com.example.anando.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setTitle("Calculator");
    }
    public  void onClickAdd(View view){
        EditText textView1 = (EditText)findViewById(R.id.numberOne);
        EditText textView2 = (EditText)findViewById(R.id.numberTwo);
        String str = textView1.getText().toString();
        double numberOne = Double.parseDouble(str);
        str = textView2.getText().toString();
        double numberTwo = Double.parseDouble(str);
        double ans = numberOne + numberTwo;
        str = String.valueOf(ans);
        EditText result = (EditText)findViewById(R.id.Result);
        result.setText(str);
    }

    public  void onClickSub(View view){
        EditText textView1 = (EditText)findViewById(R.id.numberOne);
        EditText textView2 = (EditText)findViewById(R.id.numberTwo);
        String str = textView1.getText().toString();
        double numberOne = Double.parseDouble(str);
        str = textView2.getText().toString();
        double numberTwo = Double.parseDouble(str);
        double ans = numberOne - numberTwo;
        str = String.valueOf(ans);
        EditText result = (EditText)findViewById(R.id.Result);
        result.setText(str);
    }
}
