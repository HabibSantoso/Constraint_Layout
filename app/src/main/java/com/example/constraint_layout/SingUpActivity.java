package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SingUpActivity extends AppCompatActivity {

    EditText edpNama, edpAlamat, edpEmail, edpPass, edprePass;

    Button bSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        edpNama = findViewById(R.id.editUpName);
        edpAlamat = findViewById(R.id.editUpAddress);
        edpEmail = findViewById(R.id.editUpEmail);
        edpPass = findViewById(R.id.editUpPassword);
        edprePass = findViewById(R.id.editCheckPassword);

        bSingUp = findViewById(R.id.btSingup);

        bSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edpNama.getText().toString().isEmpty() ||
                    edpAlamat.getText().toString().isEmpty() ||
                    edpEmail.getText().toString().isEmpty() ||
                    edpPass.getText().toString().isEmpty() ||
                    edprePass.getText().toString().isEmpty()){

                    Snackbar.make(view, "Wajib isi seluruh data!!!", Snackbar.LENGTH_LONG).show();
                }else {
                    if (edprePass.getText().toString().equals(edpPass.getText().toString())) {
                        Toast.makeText(SingUpActivity.this, "Sing-Up Success...", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }else {
                        Snackbar.make(view, "Password dan rePassword harus sama!!!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}