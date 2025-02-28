package com.example.blooddrop;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    //GoogleSignInOptions gso;
    //GoogleSignInClient gsc;
    public static  final String SHARED_PREFS  = "sharedPrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);

        LinearLayout aboutus = findViewById(R.id.aboutUs);
        LinearLayout privacy = findViewById(R.id.Privacy);
        Button logout = findViewById(R.id.button13);

        //gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        //gsc = GoogleSignIn.getClient(this, gso);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutUser();
            }
        });



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutUser();
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, AboutUS.class);
                startActivity(intent);
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, PrivacyPolicy.class);
                startActivity(intent);
            }
        });
    }

    private void logoutUser() {
        //FirebaseAuth.getInstance().signOut();

        // Clear login state in SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isLoggedIn", false);  // Set login state to false
        editor.apply();

        // Redirect to the login page
        Intent intent = new Intent(Settings.this, userlogin.class);
        startActivity(intent);
        finish();
    }

}