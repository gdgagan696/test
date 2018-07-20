package com.example.gagan.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserHome extends AppCompatActivity {
    private Button donors;
    private Button receivers;
    private Button bloodBanks;
    private Button myProfile;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        donors=findViewById(R.id.donors);
        receivers=findViewById(R.id.receivers);
        bloodBanks=findViewById(R.id.bloodbanks);
        myProfile=findViewById(R.id.myprofile);
        share=findViewById(R.id.share);
        donors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserHome.this,Profile.class));
            }
        });
        receivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserHome.this,ReceiverActivity.class));
            }
        });
        bloodBanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserHome.this,BloodBank.class));
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(android.content.Intent.ACTION_SEND);
                i.setType("text/plain");
                startActivity(Intent.createChooser(i,"Share via"));
            }
        });
    }


}