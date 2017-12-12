package ru.gs.simpleandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        A a = new A();
        int b = a.Random(1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
