//mainactivity.java

package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomething(View view) {
        switch(view.getId()) {
            case R.id.b1:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.google.com"));
                startActivity(i1);
                break;
            case R.id.b2:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:8970354451"));
                startActivity(i2);
                break;
            case R.id.b3:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:27.173291,78.042068"));
                startActivity(i3);
                break;
        }
    }
}
