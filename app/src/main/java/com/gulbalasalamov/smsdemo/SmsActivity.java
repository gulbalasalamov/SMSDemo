package com.gulbalasalamov.smsdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:55512345;53312345;54212345"));
        smsIntent.putExtra("sms_body", "Selamlar!");
        startActivity(smsIntent);

    }
}
