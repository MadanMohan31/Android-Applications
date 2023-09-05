package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.edit1);
        age = (EditText) findViewById(R.id.edit2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sh1 = getSharedPreferences("myownshared",MODE_PRIVATE);
        String s1 = sh1.getString("user", "");
        int a1 = sh1.getInt("age", 0);
        name.setText(s1);
        age.setText(String.valueOf(a1));
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sh = getSharedPreferences("myownshared",MODE_PRIVATE);
        SharedPreferences.Editor myedit = sh.edit();
        myedit.putString("user", name.getText().toString());
        myedit.putInt("age", Integer.parseInt(age.getText().toString()));
        myedit.commit();
    }
}
