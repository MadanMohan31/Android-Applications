//mainactivity.java

package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
    }

    public void login(View view) {
        if(uname.getText().toString().equals("Madan")&&password.getText().toString().equals("3123"))
        {
            startActivity(new Intent(MainActivity.this,Second.class));
        }
        else
        {
            Toast.makeText(this,"Failure", Toast.LENGTH_SHORT).show();
        }
    }
}



//second.java

package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
