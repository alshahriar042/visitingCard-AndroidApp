package com.example.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
 Button buttonCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall =findViewById(R.id.btnCall);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       Intent intent = new Intent(Intent.ACTION_DIAL);
                       intent.setData(Uri.parse("tel:01812821004"));
                       startActivity(intent);
            }
        });
    }
}