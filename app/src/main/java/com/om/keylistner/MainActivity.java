package com.om.keylistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_1,edt_2,edt_3,edt_4,edt_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_1 = findViewById(R.id.edt1);
        DigitsKeyListener dkl1 = DigitsKeyListener.getInstance(true,true);
        edt_1.setKeyListener(dkl1);

        edt_2 = findViewById(R.id.edt2);
        DigitsKeyListener dkl2 = DigitsKeyListener.getInstance(false , true);
        edt_2.setKeyListener(dkl2);

        edt_3 = findViewById(R.id.edt3);
        DateKeyListener dkl3 = DateKeyListener.getInstance();
        edt_3.setKeyListener(dkl3);

        edt_4 = findViewById(R.id.edt5);
        MultiTapKeyListener dkl4 = new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS,true);
        edt_4.setKeyListener(dkl4);

        edt_5 = findViewById(R.id.edt5);
        QwertyKeyListener qk1 = new QwertyKeyListener(TextKeyListener.Capitalize.CHARACTERS.SENTENCES,true);
        edt_5.setKeyListener(qk1);
    }
}