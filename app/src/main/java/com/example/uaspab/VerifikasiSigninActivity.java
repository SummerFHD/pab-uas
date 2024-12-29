package com.example.uaspab;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class VerifikasiSigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ambil data dari Intent
        String email = getIntent().getStringExtra("EMAIL");
        String password = getIntent().getStringExtra("PASSWORD");

        // Validasi email dan password
        String validEmail = "user@gmail.com";
        String validPassword = "01012000"; // Format ddmmyyyy

        if (email.equals(validEmail) && password.equals(validPassword)) {
            // Jika valid, arahkan ke ProfilActivity
            Intent intent = new Intent(VerifikasiSigninActivity.this, ProfilActivity.class);
            intent.putExtra("EMAIL", email);
            startActivity(intent);
        } else {
            // Jika tidak valid, kembali ke MainActivity dengan pesan error
            Intent intent = new Intent(VerifikasiSigninActivity.this, MainActivity.class);
            intent.putExtra("ERROR_MESSAGE", "User ID (email) / Password Salah");
            startActivity(intent);
            finish();
        }
    }
}
