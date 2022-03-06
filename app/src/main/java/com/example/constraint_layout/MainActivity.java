package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklasrasi variable untuk button
    Button btnlogin;

    //Deklasrasi variable untuk editText
    EditText edemail, edpasswords;

    //Deklasrasi variable untuk menyimpan email dan password
    String email, passwords, bankEmail, bankPass;

    //Deklasrasi variable untuk notif yang akan muncul
    Toast t, fA, fE ,fP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable untuk validasi akses
        bankEmail = "habib122@cobamail.com";
        bankPass = "12345";

        //Menghubukan variable btnlogin dengan componen button pada layout
        btnlogin = findViewById(R.id.btSingin);

        //Menghubukan variable edemail dengan componen editText pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubukan variable edpassword dengan componen button pada layout
        edpasswords = findViewById(R.id.edPassword);

        //Membuat variable Toast saat benar
        t = Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);

        //Membuat variable Toast saat email salah
        fE = Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_LONG);

        //Membuat variable Toast saat passwords salah
        fP = Toast.makeText(getApplicationContext(), "Passwords Salah", Toast.LENGTH_LONG);

        //Membuat variable Toast saat semua salah
        fA = Toast.makeText(getApplicationContext(), "Email dan Passwords Salah", Toast.LENGTH_LONG);

        //Membuat funtion onclik pada button btnlogin
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di editText edEmail kedalam variable email
                email = edemail.getText().toString();

                //Menyimpan input user di editText edPassword kedalam variable password
                passwords = edpasswords.getText().toString();

                if (email.equals(bankEmail)){
                    if (passwords.equals(bankPass)){
                        t.show();
                    }else {
                        edpasswords.setText(null);
                        fP.show();
                    }
                }if (passwords.equals(bankPass)){
                    edemail.setText(null);
                    edpasswords.setText(null);

                    fE.show();
                }else {
                    edemail.setText(null);
                    edpasswords.setText(null);

                    fA.show();
                }

            }
        });
    }
}