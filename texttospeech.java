package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    EditText textData;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void voice(View view)
    {
        textData = (EditText) findViewById(R.id.text);
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int i)
            {
                if (i == TextToSpeech.SUCCESS)
                {
                    tts.speak(textData.getText().toString(), TextToSpeech.QUEUE_ADD, null, null);
                }
            }

        });
    }
}
