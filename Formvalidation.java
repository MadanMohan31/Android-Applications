//mainactivity.java

package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText username, password, email, phone;
    Button submit;
    Spinner spinner;
    String allData = "", spinner_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.locations,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    public void submitData(View view) {

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);

        submit = (Button) findViewById(R.id.submit);

        allData += "Name:"+username.getText().toString()+"\n"+"Email:"+email.getText().toString()+"\n"+"Password:"+password.getText().toString()+"\n"+"Phone:"+phone.getText().toString()+"\n"+"Country:"+spinner_text+"\n";
        Toast.makeText(this, ""+allData, Toast.LENGTH_SHORT).show();
        allData = "";

    }

    @Override
    public void onItemSelected(AdapterView<?>adapterView,View view, int i, long l)
    {
        spinner_text = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?>adapterView)
    {

    }
}




// res -> values -> string.xml

<resources>
    <string name="app_name">Form Validation</string>
    <string-array name="locations">
        <item>India</item>
        <item>Canada</item>
        <item>Japan</item>
        <item>Germany</item>
        <item>Switzerland</item>
        <item>Australia</item>
        <item>United State</item>
        <item>New Zealand</item>
        <item>United Kingdom</item>
        <item>Sweden</item>
    </string-array>
</resources>
