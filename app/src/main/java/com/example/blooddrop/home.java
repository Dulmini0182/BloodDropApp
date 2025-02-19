package com.example.blooddrop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class home extends AppCompatActivity {

    TextView txtD, txtR, txtB;

    private static final int PICK_FILE_REQUEST = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);



        txtD = findViewById(R.id.textView12);
        txtR = findViewById(R.id.req);
        txtB = findViewById(R.id.bloodbank);



        txtD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, Donor.class);
                startActivity(intent);
            }
        });

        txtR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, Request.class);
                startActivity(intent);
            }
        });

        txtB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, Events.class);
                startActivity(intent);
            }
        });

    }

}     // D.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {

               // Intent intent = new Intent(home.this,Donor.class);
               // startActivity(intent);

           // }
     //   });

       // R1.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {

              //  Intent intent = new Intent(home.this,Requestpage.class);
///startActivity(intent);

          //  }
        //});

      //  B1.setOnClickListener(new View.OnClickListener() {
           /// @Override
           // public void onClick(View v) {

              //  Intent intent = new Intent(home.this,bloodbank.class);
              //  startActivity(intent);
//
            //}
      //  });



