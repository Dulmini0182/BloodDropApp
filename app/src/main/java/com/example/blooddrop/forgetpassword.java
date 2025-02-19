package com.example.blooddrop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class forgetpassword extends AppCompatActivity {

    private EditText etEmail;
    //private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        etEmail = findViewById(R.id.etEmail);
        Button btnSendReset = findViewById(R.id.btnSendReset);
        TextView tvBackToLogin = findViewById(R.id.tvBackToLogin);


        //mAuth = FirebaseAuth.getInstance();

        // Back to Login
        tvBackToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(forgetpassword.this, userlogin.class);
            startActivity(intent);
            finish();
        });

        // Send Reset Link
        btnSendReset.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                etEmail.setError("Email is required");
                return;
            }

            /*mAuth.sendPasswordResetEmail(email)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(forgetpassword.this,
                                    "Password reset email sent. Check your inbox.",
                                    Toast.LENGTH_LONG).show();

                            // Optionally redirect to login page
                            Intent intent = new Intent(forgetpassword.this, userlogin.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(forgetpassword.this,
                                    "Error: " + task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });*/
        });
    }
}
