package com.example.amul.faq;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportDetails extends AppCompatActivity {

    private Button collegeBus;
    private Button outBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_details);

        collegeBus=(Button)findViewById(R.id.button);
        collegeBus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://docs.google.com/spreadsheets/d/10FfUTgH5PW5MmXoABHDc9HmMV0UrEackdNf4iI3TJwo/edit?usp=sharing";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        outBus=(Button)findViewById(R.id.button2);
        outBus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(TransportDetails.this,OutBusActivity.class);
                startActivity(i);
            }
        });
    }
}
