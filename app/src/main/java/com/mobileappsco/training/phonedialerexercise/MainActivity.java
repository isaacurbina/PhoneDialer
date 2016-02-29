package com.mobileappsco.training.phonedialerexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.textView);
    }

    public void numberClicked(View view) {
        int viewID = view.getId();

        if (viewID == R.id.callButton) {
            myTextView.setText("");
        } else {
            Button myButton = (Button) view;
            String buttonText = myButton.getText().toString();
            myTextView.setText(myTextView.getText().toString()+buttonText);
        }

    }
}
