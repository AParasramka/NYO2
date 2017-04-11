package com.example.aditya.nyo2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //creating objects of the respective classes
    Button b1;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //links java file to xml file

        b1=(Button) findViewById(R.id.btn1);    //linking the button using its id
        et=(EditText) findViewById(R.id.tview1);    //linking the edit text view
        tv=(TextView) findViewById(R.id.tview2);     //linking the text view
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str = et.getText().toString();     //gettext function to get the string from wdit text box
                tv.setText(str);                          //storing the text in a string str and then giving it to text view
            }
        });
    }
}
